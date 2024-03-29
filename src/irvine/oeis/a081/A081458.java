package irvine.oeis.a081;
// Generated by gen_seq4.pl trisimple/trisimard at 2021-11-07 23:41

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A081458 Table T(m,n) = (3^m + 5^n)/2, for m, n = 0, 2, 4, 6, ... read by antidiagonals downwards.
 *
 * @author Georg Fischer
 */
public class A081458 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A081458() {
    super(0, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.THREE.pow(2L * n).add(Z.FIVE.pow(2L * k)).divide2();
  }
}
