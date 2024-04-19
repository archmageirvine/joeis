package irvine.math.expression;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * An expression for factorials.
 * @author Sean A. Irvine
 */
public class Factorial extends AbstractExpression {

  private final Expression mExpr;

  /**
   * Construct the factorial of an expression.
   * @param expr expression to compute the factorial of
   */
  public Factorial(final Expression expr) {
    mExpr = expr;
  }

  @Override
  public Expression performEval() {
    final Expression expr = mExpr.eval();
    if (expr instanceof Literal<?, ?>) {
      final Literal<?, ?> lit = (Literal<?, ?>) expr;
      if (lit.value() instanceof Z) {
        return new LiteralZ(Functions.FACTORIAL.z((Z) lit.value()));
      }
      throw new UnsupportedOperationException("Factorial on " + lit.ring());
    } else if (expr == mExpr) {
      return this;
    } else {
      return new Factorial(expr);
    }
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return new Factorial(mExpr.substitute(var, value));
  }

  @Override
  public Expression diff(final Identifier var) {
    // This could potentially be done in terms of the psi function
    throw new UnsupportedOperationException("derivative of factorial");
  }

  @Override
  public int complexity() {
    return 1 + mExpr.complexity();
  }

  @Override
  public Precedence precedence() {
    return Precedence.FUNCTION;
  }

  @Override
  public boolean contains(final Expression expr) {
    return equals(expr) || mExpr.contains(expr);
  }

  @Override
  public String toString() {
    return ExpressionUtils.toString(mExpr) + "!";
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof Factorial)) {
      return false;
    }
    final Factorial that = (Factorial) obj;
    return mExpr.equals(that.mExpr);
  }

  @Override
  public int hashCode() {
    return 19 * mExpr.hashCode();
  }
}
