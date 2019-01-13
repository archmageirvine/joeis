package irvine.math.expression;

/**
 * Base class for expressions.
 * @author Sean A. Irvine
 */
public abstract class AbstractLeftRightExpression extends AbstractExpression implements LeftRight {

  private final Expression mLeft;
  private final Expression mRight;
  private final String mOp;
  private final int mComplexity;
  private final int mHashCode;

  /**
   * Arguments of the two term expression
   * @param left first expression
   * @param right second expression
   * @param op the string representation of the operator
   */
  public AbstractLeftRightExpression(final Expression left, final Expression right, final String op) {
    mLeft = left;
    mRight = right;
    mOp = op;
    mComplexity = 1 + mLeft.complexity() + mRight.complexity();
    mHashCode = mLeft.hashCode() + mOp.hashCode() * mRight.hashCode();
  }

  @Override
  public Expression left() {
    return mLeft;
  }

  @Override
  public Expression right() {
    return mRight;
  }

  @Override
  public int complexity() {
    return mComplexity;
  }

  @Override
  public boolean contains(final Expression expr) {
    return equals(expr) || left().contains(expr) || right().contains(expr);
  }

  @Override
  public String toString() {
    return ExpressionUtils.toString(left(), precedence()) + mOp + ExpressionUtils.toString(right(), precedence());
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == null || obj.getClass() != getClass()) {
      return false;
    }
    final AbstractLeftRightExpression that = (AbstractLeftRightExpression) obj;
    return left().equals(that.left()) && right().equals(that.right());
  }

  @Override
  public int hashCode() {
    return mHashCode;
  }
}
