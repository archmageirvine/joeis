package irvine.math.series;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import irvine.math.q.Q;
import irvine.math.q.QUtils;

/**
 * Parse expressions for generating functions.
 * @author Sean A. Irvine
 */
public class SeriesParser {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;

  private enum TokenType {
    NUMBER, VARIABLE, OP, POLYNOMIAL, LPAREN, RPAREN, END
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

  private static List<Token> rewriteRationals(final List<Token> tokens) {
    // This is a pragmatic rewriting of some common forms for later efficiency

    // Collapses (a/b), where a and b are numbers into single number tokens
    for (int k = 0; k < tokens.size() - 4; ++k) {
      if (tokens.get(k).mType == TokenType.LPAREN
        && tokens.get(k + 4).mType == TokenType.RPAREN
        && tokens.get(k + 1).mType == TokenType.NUMBER
        && tokens.get(k + 3).mType == TokenType.NUMBER
        && tokens.get(k + 2).mType == TokenType.OP && tokens.get(k + 2).mValue.equals("/")
      ) {
        final String v = tokens.get(k + 1).mValue + "/" + tokens.get(k + 3).mValue;
        tokens.set(k, new Token(TokenType.NUMBER, v));
        tokens.subList(k + 1, k + 5).clear();
      }
    }
    // Collapses a/b, where a and b are numbers into single number tokens
    for (int k = 0; k < tokens.size() - 4; ++k) {
      if (tokens.get(k).mType == TokenType.NUMBER
        && tokens.get(k + 2).mType == TokenType.NUMBER
        && tokens.get(k + 1).mType == TokenType.OP && tokens.get(k + 1).mValue.equals("/")
      ) {
        final String v = tokens.get(k).mValue + "/" + tokens.get(k + 2).mValue;
        tokens.set(k, new Token(TokenType.NUMBER, v));
        tokens.subList(k + 1, k + 3).clear();
      }
    }
    return tokens;
  }

  private static List<Token> rewriteMonomials(final List<Token> tokens) {
    // todo bogus needs to hand x^k
    // Collapses number * x to a monomial
    for (int k = 0; k < tokens.size() - 4; ++k) {
      if (tokens.get(k).mType == TokenType.NUMBER
        && tokens.get(k + 2).mType == TokenType.VARIABLE
        && tokens.get(k + 1).mType == TokenType.OP && tokens.get(k + 1).mValue.equals("*")
      ) {
        final String v = tokens.get(k).mValue + "*" + tokens.get(k + 2).mValue;
        tokens.set(k, new Token(TokenType.POLYNOMIAL, v));
        tokens.subList(k + 1, k + 3).clear();
      }
    }
    return tokens;
  }

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
    final List<Token> tokens = new Tokenizer(expr).tokenize();
    mTokens = rewriteRationals(tokens);
    //mTokens = tokens; //rewriteMonomials(rewriteRationals(tokens));
    //System.out.println(mTokens);
    mIndex = 0;
    return parseExpression();
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

    if (!match(TokenType.LPAREN, "(")) {
      throw new RuntimeException("Expected '(' after function name: " + fname);
    }
    consume(); // consume '('
    final Series<Q> arg = parseExpression();
    consume(); // consume ')'

    // todo add other functions here, or perhaps reflect on function name?
    switch (fname) {
      case "serlaplace":
        return SQ.laplace(arg);
      case "exp":
        return SQ.substitute(RationalSeriesEnum.EXP.s(), arg);
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
    if (t.mType == TokenType.POLYNOMIAL) {
      consume();
      return Series.create(QUtils.parsePolynomial(t.mValue));
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

