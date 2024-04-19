package irvine.oeis.a187;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A187783 De Bruijn's triangle, T(m,n) = (m*n)!/(n!^m) read by downward antidiagonals.
 * @author Georg Fischer
 */
public class A187783 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A187783() {
    super(0, 0, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int m, final int n) {
    return Functions.FACTORIAL.z(m * n).divide(Functions.FACTORIAL.z(n).pow(m));
  }
}
