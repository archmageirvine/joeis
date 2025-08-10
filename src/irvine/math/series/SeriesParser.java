package irvine.math.series;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import irvine.math.q.Q;
import irvine.math.q.QUtils;

/**
 * Parse expressions for generating functions.
 * This parser is designed to handle commonly occurring ordinary and exponential
 * generating functions occurring in the OEIS.
 * The variable is assumed to be "<code>x</code>".
 * The expression is first tokenized, then a selection of transformations are
 * applied to the token stream to recognize common formations and convert them
 * to a form we can efficiently compute series for.  In particular, an effort
 * is made to identify the polynomials components of the input. Finally, the
 * resulting token stream is parsed into a <code>Series</code> object which can
 * be directly queried for coefficients.
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
      final Pattern pattern = Pattern.compile("\\d+/\\d+|\\d+|[a-zA-Z][a-zA-Z0-9_]*|[+\\-*/^()]");
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
        } else if (match.matches("[a-zA-Z][a-zA-Z0-9_]*")) {
          mTokens.add(new Token(TokenType.OP, match)); // function name
        }
      }
      mTokens.add(new Token(TokenType.END, ""));
      return mTokens;
    }
  }

  private List<Token> mTokens;
  private int mIndex;

  private static boolean isAdditiveOp(final Token tok) {
    return tok.mType == TokenType.OP && (tok.mValue.equals("+") || tok.mValue.equals("-"));
  }

  private static boolean isMultiply(final Token tok) {
    return tok.mType == TokenType.OP && tok.mValue.equals("*");
  }

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
    // Collapses (a) to a, where a is a number
    for (int k = 0; k < tokens.size() - 3; ++k) {
      if (tokens.get(k).mType == TokenType.LPAREN
        && tokens.get(k + 1).mType == TokenType.NUMBER
        && tokens.get(k + 2).mType == TokenType.RPAREN
      ) {
        tokens.remove(k + 2);
        tokens.remove(k);
      }
    }
    return tokens;
  }

  private static List<Token> rewriteMonomials(final List<Token> tokens) {
    // The order in which we try things here matters!

    // Collapses n * x ^ k to a monomial
    for (int k = 0; k < tokens.size() - 5; ++k) {
      if (tokens.get(k).mType == TokenType.NUMBER
        && tokens.get(k + 2).mType == TokenType.VARIABLE
        && tokens.get(k + 4).mType == TokenType.NUMBER
        && isMultiply(tokens.get(k + 1))
        && tokens.get(k + 3).mType == TokenType.OP && tokens.get(k + 3).mValue.equals("^")
      ) {
        final String v = tokens.get(k).mValue + "*x^" + tokens.get(k + 4).mValue;
        tokens.set(k, new Token(TokenType.POLYNOMIAL, v));
        tokens.subList(k + 1, k + 5).clear();
      }
    }
    // Collapses n x ^ k to a monomial
    for (int k = 0; k < tokens.size() - 3; ++k) {
      if (tokens.get(k).mType == TokenType.NUMBER
        && tokens.get(k + 1).mType == TokenType.VARIABLE
        && tokens.get(k + 3).mType == TokenType.NUMBER
        && tokens.get(k + 2).mType == TokenType.OP && tokens.get(k + 2).mValue.equals("^")
      ) {
        final String v = tokens.get(k).mValue + "*x^" + tokens.get(k + 3).mValue;
        tokens.set(k, new Token(TokenType.POLYNOMIAL, v));
        tokens.subList(k + 1, k + 4).clear();
      }
    }
    // Collapses n * x to a monomial
    for (int k = 0; k < tokens.size() - 3; ++k) {
      if (tokens.get(k).mType == TokenType.NUMBER
        && tokens.get(k + 2).mType == TokenType.VARIABLE
        && isMultiply(tokens.get(k + 1))
      ) {
        final String v = tokens.get(k).mValue + "*x";
        tokens.set(k, new Token(TokenType.POLYNOMIAL, v));
        tokens.subList(k + 1, k + 3).clear();
      }
    }
    // Collapses n x to a monomial
    for (int k = 0; k < tokens.size() - 2; ++k) {
      if (tokens.get(k).mType == TokenType.NUMBER
        && tokens.get(k + 1).mType == TokenType.VARIABLE
      ) {
        final String v = tokens.get(k).mValue + "*x";
        tokens.set(k, new Token(TokenType.POLYNOMIAL, v));
        tokens.subList(k + 1, k + 2).clear();
      }
    }
    // Collapses x ^ k to a monomial
    for (int k = 0; k < tokens.size() - 2; ++k) {
      if (tokens.get(k).mType == TokenType.VARIABLE
        && tokens.get(k + 2).mType == TokenType.NUMBER
        && tokens.get(k + 1).mType == TokenType.OP && tokens.get(k + 2).mValue.equals("^")
      ) {
        final String v = "x^" + tokens.get(k + 2).mValue;
        tokens.set(k, new Token(TokenType.POLYNOMIAL, v));
        tokens.subList(k + 1, k + 2).clear();
      }
    }
    return tokens;
  }

  private static List<Token> rewritePolynomials(final List<Token> tokens) {
    // Collapses consecutive additive polynomial terms to a single polynomial
    for (int k = 0; k < tokens.size(); ++k) {
      if (tokens.get(k).mType == TokenType.LPAREN) {
        for (int j = k + 1; j < tokens.size(); ++j) {
          final TokenType tj = tokens.get(j).mType;
          if (tj == TokenType.RPAREN) {
            // Success, collect all the polynomial parts together
            final StringBuilder poly = new StringBuilder();
            for (int i = k + 1; i < j; ++i) {
              poly.append(tokens.get(i).mValue);
            }
            tokens.set(k, new Token(TokenType.POLYNOMIAL, poly.toString()));
            tokens.subList(k + 1, j + 1).clear();
            break;
          }
          if (tj != TokenType.NUMBER && tj != TokenType.POLYNOMIAL && !isAdditiveOp(tokens.get(j))) {
            break; // not a polynomial
          }
        }
      }
    }
    return tokens;
  }

  private static List<Token> rewriteSpecials(final List<Token> tokens) {
    // Handle some other special constructions:
    //  x * cot -> xcot
    //  x * csc -> xcsc
    for (int k = 0; k < tokens.size(); ++k) {
      if (tokens.get(k).mType == TokenType.VARIABLE && isMultiply(tokens.get(k + 1)) && tokens.get(k + 2).mType == TokenType.OP) {
        if (tokens.get(k + 2).mValue.equals("cot")) {
          tokens.set(k, new Token(TokenType.OP, "xcot"));
          tokens.subList(k + 1, k + 3).clear();
        } else if (tokens.get(k + 2).mValue.equals("csc")) {
          tokens.set(k, new Token(TokenType.OP, "xcsc"));
          tokens.subList(k + 1, k + 3).clear();
        }
      }
    }
    return tokens;
  }

  List<Token> tokenize(final String expr) {
    // Before attempting general parsing, we make an effort to identify polynomials
    // in typical forms. This identification reduces the burden on the Series
    // handling mechanism later on saving both memory and time.
    final List<Token> tokens = rewritePolynomials(rewriteMonomials(rewriteSpecials(rewriteRationals(new Tokenizer(expr).tokenize()))));
    //System.out.println(tokens);
    return tokens;
  }

  /**
   * Parse an expression into a series object.
   * @param expr expression
   * @return series
   */
  public Series<Q> parse(final String expr) {
    mTokens = tokenize(expr);
    mIndex = 0;
    return parseExpression();
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
    // We've constructed everything as a series, here we support efficiency by
    // detecting scalar multiply and divides.

    // todo other potential efficiency gains here would be detecting shifts (*x^n) etc.

    Series<Q> result = parseFactor();
    while (match(TokenType.OP, "*") || match(TokenType.OP, "/")) {
      final String op = consume().mValue;
      final Series<Q> right = parseFactor();
      if (op.equals("*")) {
        if (result.bound() == 0) {
          // Scalar multiply
          result = SQ.multiply(right, result.coeff(0));
        } else if (right.bound() == 0) {
          // Scalar multiply
          result = SQ.multiply(result, right.coeff(0));
        } else {
          // Series multiply
          result = SQ.multiply(result, right);
        }
      } else {
        if (right.bound() == 0) {
          // Scalar divide
          result = SQ.divide(result, right.coeff(0));
        } else {
          // Series divide
          result = SQ.divide(result, right);
        }
      }
    }
    return result;
  }

  private Series<Q> parseFactor() {
    Series<Q> base = parseBase();
    if (match(TokenType.OP, "^")) {
      consume(); // consume ^
      final Series<Q> exponentSeries = parseFactor();
      // Warning: This makes (unchecked) assumption that the exponent is a single simple integer
      final Q exponent = exponentSeries.coeff(0);
      // Decide between simple integer powers and other rational powers
      base = exponent.isInteger() ? SQ.pow(base, exponent.toZ().longValueExact()) : SQ.powE(base, exponent);
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

    // Some functions need special handling, but most can be handled by the
    // enumeration in RationalSeriesEnum
    switch (fname) {
      case "serlaplace":
        return SQ.laplace(arg);
      case "sqrt":
        return SQ.powE(arg, Q.HALF);
      case "log":
        return SQ.substitute(RationalSeriesEnum.LOG1P.s(), SQ.subtract(arg, SQ.one()));
      default:
        // Look up the function in the available functions
        final RationalSeriesEnum f = RationalSeriesEnum.valueOf(fname.toUpperCase(Locale.ROOT));
        return SQ.substitute(f.s(), arg);
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

}

