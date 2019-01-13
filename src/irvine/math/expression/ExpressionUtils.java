package irvine.math.expression;

/**
 * Utility functions relating to expressions.
 * @author Sean A. Irvine
 */
final class ExpressionUtils {

  private ExpressionUtils() { }

  static String toString(final Expression e) {
    if (e instanceof Identifier || e instanceof Literal || e instanceof UnaryFunction) {
      return e.toString();
    } else {
      return "(" + e.toString() + ")";
    }
  }

  static String toString(final Expression e, final Precedence enclosingPrecedence) {
    if (enclosingPrecedence.ordinal() <= e.precedence().ordinal()) {
      return e.toString();
    } else {
      return "(" + e.toString() + ")";
    }
  }
}
