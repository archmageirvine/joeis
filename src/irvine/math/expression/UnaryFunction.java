package irvine.math.expression;

/**
 * An expression for a unary function
 * @author Sean A. Irvine.
 */
public abstract class UnaryFunction extends AbstractExpression {

  private final Expression mExpr;
  private final String mName;
  private final int mComplexity;
  private final int mHashCode;

  /**
   * Construct a general unary function.
   * @param expr argument to the function
   * @param name name of the function
   */
  public UnaryFunction(final Expression expr, final String name) {
    mExpr = expr;
    mName = name;
    mComplexity = 1 + mExpr.complexity();
    mHashCode = 3 * mExpr.hashCode() + mName.hashCode();
  }

  Expression arg() {
    return mExpr;
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
    return equals(expr) || arg().contains(expr);
  }

  @Override
  public String toString() {
    return mName + "(" + mExpr + ")";
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof UnaryFunction)) {
      return false;
    }
    final UnaryFunction that = (UnaryFunction) obj;
    return mName.equals(that.mName) && arg().equals(that.arg());
  }

  @Override
  public int hashCode() {
    return mHashCode;
  }
}
