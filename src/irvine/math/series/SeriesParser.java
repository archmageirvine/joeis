package irvine.math.series;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import irvine.math.q.Q;

/**
 * Parse expressions for generating functions.
 * @author Sean A. Irvine
 */
public class SeriesParser {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;

  private enum TokenType {
    NUMBER, VARIABLE, OP, LPAREN, RPAREN, END
  }

  private static final class Token {
    final TokenType mType;
    final String mValue;

    private Token(final TokenType type, final String value) {
      mType = type;
      mValue = value;
    }

    @Override
    public String toString() {
      return String.format("Token(%s, \"%s\")", mType, mValue);
    }
  }

  private static final class Tokenizer {
    private final String mInput;
    private final List<Token> mTokens = new ArrayList<>();

    private Tokenizer(final String input) {
      mInput = input.replaceAll("\\s+", "");
    }

    public List<Token> tokenize() {
      final Pattern pattern = Pattern.compile("\\d+/\\d+|\\d+|[a-zA-Z]+|[+\\-*/^()]");
      final Matcher matcher = pattern.matcher(mInput);
      while (matcher.find()) {
        final String match = matcher.group();
        if (match.equals("x")) {
          mTokens.add(new Token(TokenType.VARIABLE, match));
        } else if (match.matches("[+\\-*/^]")) {
          mTokens.add(new Token(TokenType.OP, match));
        } else if (match.equals("(")) {
          mTokens.add(new Token(TokenType.LPAREN, match));
        } else if (match.equals(")")) {
          mTokens.add(new Token(TokenType.RPAREN, match));
        } else if (match.matches("\\d+/\\d+|\\d+")) {
          mTokens.add(new Token(TokenType.NUMBER, match));
        } else if (match.matches("[a-zA-Z]+")) {
          mTokens.add(new Token(TokenType.OP, match)); // function name
        }
      }
      mTokens.add(new Token(TokenType.END, ""));
      return mTokens;
    }
  }

  private List<Token> mTokens;
  private int mIndex;

  /**
   * Parse an expression into a series object.
   * @param expr expression
   * @return series
   */
  public Series<Q> parse(final String expr) {
    // In the input we first try to identify portions that correspond to polynomials
    // and wrap them in "poly()" making them easier to treat later in parsing.
    // It does not matter if this does not capture every case.
    //final String rewrite = rewritePolynomials(expr);
    mTokens = new Tokenizer(expr).tokenize();
    //System.out.println(mTokens);
    mIndex = 0;
    return parseExpression();
  }

  // todo this doesn't work properly in presence of "exp" etc.
  private static String rewritePolynomials(final String input) {
    // Pattern for one polynomial term
    final String term = "[+-]?\\s*(\\(\\d+/\\d+\\)|\\d+/\\d+|\\d+)?\\s*\\*?\\s*x(\\^\\d+)?"
      + "|[+-]?\\s*x(\\^\\d+)?"
      + "|[+-]?\\s*(\\(\\d+/\\d+\\)|\\d+/\\d+|\\d+)";

    // Pattern for sum of terms
    final String fullPoly = "(" + term + ")(\\s*[+-]\\s*" + term + ")*";

    final Pattern polyPattern = Pattern.compile(fullPoly);
    final Matcher matcher = polyPattern.matcher(input);
    final StringBuilder sb = new StringBuilder();

    while (matcher.find()) {
      final String poly = matcher.group();
      matcher.appendReplacement(sb, "poly(" + poly + ")");
    }
    matcher.appendTail(sb);
    return sb.toString();
  }

  private Series<Q> parsePolyArgument() {
    final Token t = consume();
    if (t.mType != TokenType.LPAREN) {
      throw new RuntimeException("Expected ( after poly");
    }
    final StringBuilder arg = new StringBuilder();
    int parenDepth = 1;
    while (parenDepth > 0) {
      final Token tok = consume();
      if (tok.mType == TokenType.LPAREN) {
        ++parenDepth;
      } else if (tok.mType == TokenType.RPAREN) {
        --parenDepth;
      }
      if (parenDepth > 0) {
        arg.append(tok.mValue);
      }
    }
    return Series.create(arg.toString());
  }

  private Token peek() {
    return mTokens.get(mIndex);
  }

  private Token consume() {
    return mTokens.get(mIndex++);
  }

  private boolean match(final TokenType type, final String value) {
    final Token t = peek();
    return t.mType == type && t.mValue.equals(value);
  }

  private Series<Q> parseExpression() {
    Series<Q> result = parseTerm();
    while (match(TokenType.OP, "+") || match(TokenType.OP, "-")) {
      final String op = consume().mValue;
      final Series<Q> right = parseTerm();
      if (op.equals("+")) {
        result = SQ.add(result, right);
      } else {
        result = SQ.subtract(result, right);
      }
    }
    return result;
  }

  private Series<Q> parseTerm() {
    Series<Q> result = parseFactor();
    while (match(TokenType.OP, "*") || match(TokenType.OP, "/")) {
      final String op = consume().mValue;
      final Series<Q> right = parseFactor();
      if (op.equals("*")) {
        result = SQ.multiply(result, right);
      } else {
        result = SQ.divide(result, right);
      }
    }
    return result;
  }

  private Series<Q> parseFactor() {
    Series<Q> base = parseBase();
    if (match(TokenType.OP, "^")) {
      consume(); // consume ^
      final Series<Q> exponentSeries = parseFactor();
      final long exponent = exponent(exponentSeries);
      base = SQ.pow(base, exponent);
    }
    return base;
  }

  private Series<Q> parseFunction() {
    // Read function name (e.g., "exp", "poly")
    final Token nameToken = consume();
    final String fname = nameToken.mValue;

    if (fname.equals("poly")) {
      return parsePolyArgument();
    }

    if (!match(TokenType.LPAREN, "(")) {
      throw new RuntimeException("Expected '(' after function name: " + fname);
    }
    consume(); // consume '('
    final Series<Q> arg = parseExpression();
    consume(); // consume ')'

    // todo add other functions here, or perhaps reflect on function name?
    switch (fname) {
      case "serlaplace":
        return SQ.serlaplace(arg);
      case "exp":
        return SQ.substitute(RationalSeriesFactory.EXP, arg);
//      case "log": return SQ.log(arg);
//      case "sqrt": return SQ.sqrt(arg);
      default:
        throw new RuntimeException("Unknown function: " + fname);
    }
  }

  private Series<Q> parseBase() {
    final Token t = peek();
    if (t.mType == TokenType.OP && Character.isLetter(t.mValue.charAt(0))) {
      return parseFunction();
    }
    if (t.mType == TokenType.NUMBER) {
      consume();
      return SQ.monomial(new Q(t.mValue), 0);
    }
    if (t.mType == TokenType.VARIABLE) {
      consume();
      return SQ.x();
    }
    if (t.mType == TokenType.LPAREN) {
      consume(); // consume (
      final Series<Q> expr = parseExpression();
      consume(); // consume )
      return expr;
    }
    throw new RuntimeException("Unexpected token: " + t.mValue);
  }

  private long exponent(final Series<Q> s) {
    // Warning: This makes (unchecked) assumption that the exponent is a single simple integer
    return s.coeff(0).toZ().longValueExact();
  }
}

