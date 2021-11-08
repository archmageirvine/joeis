package irvine.oeis.a185;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A185911 Weight array of A185910, by antidiagonals.
 *
 * @author Georg Fischer
 */
public class A185911 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A185911() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(n == 1 ? 1 : (k == 1 ? 2 * n - 1 : 0));
  }
}
