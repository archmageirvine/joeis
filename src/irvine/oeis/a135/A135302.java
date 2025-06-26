package irvine.oeis.a135;
// manually 2025-06-24

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a210.A210913;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A135302 Square array of numbers A(n,k) (n&gt;=0, k&gt;=0) of transitive reflexive early confluent binary relations R on n labeled elements where |{y : xRy}| &lt;= k for all x, read by antidiagonals.
 * @author Georg Fischer
 */
public class A135302 extends UpperLeftTriangle {

  private final A210913 mSeq = new A210913();

  /** Construct the sequence. */
  public A135302() {
    super(0, 0, 0, 1);
  }

  /**
   * Computes an element of the matrix.
   * The indices are shifted with <code>mRow0, mCol0</code>.
   * @param i shifted row number
   * @param j shifted column number
   * @return M(i, j)
   */
  public Z matrixElement(final int i, final int j) {
    return mSeq.t(j, i).coeff(i).multiply(Functions.FACTORIAL.z(i)).num();
  }

}
