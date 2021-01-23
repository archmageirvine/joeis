package irvine.math.expression;

/**
 * An expression for a derivative.
 * @author Sean A. Irvine
 */
public class Derivative extends AbstractExpression {

  private final Expression mExpr;
  private final Identifier mVariable;
  private final int mComplexity;

  /**
   * Construct the derivative of an expression.
   * @param expr expression to compute the derivative of
   * @param variable variable to take derivative with respect to
   */
  public Derivative(final Expression expr, final Identifier variable) {
    mExpr = expr;
    mVariable = variable;
    mComplexity = 1 + mExpr.complexity() + mVariable.complexity();
  }

  @Override
  public Expression performEval() {
    return mExpr.eval().diff(mVariable);
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    if (mVariable.equals(var)) {
      throw new UnsupportedOperationException("Cannot substitute across unresolved derivative");
    }
    return new Derivative(mExpr.substitute(var, value), mVariable);
  }

  @Override
  public Expression diff(final Identifier var) {
    return new Derivative(mExpr.diff(var).eval(), mVariable).eval();
  }

  @Override
  public int complexity() {
    return mComplexity;
  }

  @Override
  public Precedence precedence() {
    return Precedence.FUNCTION;
  }

  @Override
  public boolean contains(final Expression expr) {
    return equals(expr) || mExpr.contains(expr) || mVariable.contains(expr);
  }

  @Override
  public String toString() {
    return "diff(" + mExpr + ", " + mVariable + ")";
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof Derivative)) {
      return false;
    }
    final Derivative that = (Derivative) obj;
    return mVariable.equals(that.mVariable) && mExpr.equals(that.mExpr);
  }

  @Override
  public int hashCode() {
    return 7 * mExpr.hashCode() + mVariable.hashCode();
  }
}
