package irvine.math.expression;

/**
 * An expression for a variable substitution.
 * @author Sean A. Irvine
 */
public class Substitution extends AbstractExpression {

  private final Expression mExpr;
  private final Identifier mVariable;
  private final Expression mValue;

  /**
   * Construct a substitution.
   * @param expr expression to substitute into
   * @param variable variable to substitute
   * @param value value to assign to the variable
   */
  public Substitution(final Expression expr, final Identifier variable, final Expression value) {
    mExpr = expr;
    mVariable = variable;
    mValue = value;
  }

  @Override
  public Expression performEval() {
    return mExpr.eval().substitute(mVariable, mValue.eval()).eval();
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return new Substitution(mExpr.substitute(var, value), mVariable, mValue.substitute(var, value));
  }

  @Override
  public Expression diff(final Identifier var) {
    throw new UnsupportedOperationException("derivative of substitution");
  }

  @Override
  public int complexity() {
    return 1 + mExpr.complexity() + mVariable.complexity() + mValue.complexity();
  }

  @Override
  public Precedence precedence() {
    return Precedence.FUNCTION;
  }

  @Override
  public boolean contains(final Expression expr) {
    return equals(expr) || mVariable.contains(expr) || mExpr.contains(expr) || mValue.contains(expr);
  }

  @Override
  public String toString() {
    return "subs(" + mExpr + ", " + mVariable + ", " + mValue + ")";
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof Substitution)) {
      return false;
    }
    final Substitution that = (Substitution) obj;
    return mVariable.equals(that.mVariable) && mExpr.equals(that.mExpr) && mValue.equals(that.mValue);
  }

  @Override
  public int hashCode() {
    return 7 * mExpr.hashCode() + 3 * mVariable.hashCode() + mValue.hashCode();
  }
}
