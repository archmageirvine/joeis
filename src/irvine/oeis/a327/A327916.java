package irvine.oeis.a327;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A327916 Triangle T(k, n) read by rows: Array A(k, n) = 2^k*(k + 1 + 2*n), k &gt;= 0, n &gt;= 0, read by antidiagonals upwards.
 * @author Georg Fischer
 */
public class A327916 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A327916() {
    super(0, 0, 0, 1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int k, final int n) { // Caution, n <-> k !
    return Z.ONE.shiftLeft(k).multiply(2L * n + k + 1);
  }
}
