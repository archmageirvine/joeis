package irvine.oeis.a185;
// manually 2023-06-24

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A185740 Weight array of A185738, by antidiagonals.
 * @author Georg Fischer
 */
public class A185740 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A185740() {
    super(1, 1, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return (k == 1) ? Z.ONE.shiftLeft(n - 1) : ((n == 1) ? Z.ONE : Z.ZERO);
  }
}
