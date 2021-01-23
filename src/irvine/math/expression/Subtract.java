package irvine.math.expression;

/**
 * An expression for subtraction.
 * @author Sean A. Irvine
 */
public final class Subtract {

  private Subtract() { }

  /**
   * Construct the addition of two expressions.
   * @param left first addend
   * @param right second addend
   * @return the resulting expression
   */
  public static Expression create(final Expression left, final Expression right) {
    return Add.create(left.eval(), new Negate(right).eval()).eval();
  }
}
