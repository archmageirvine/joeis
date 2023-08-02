package irvine.oeis.a185;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A185879 Weight array of A185877, by antidiagonals.
 *
 * @author Georg Fischer
 */
public class A185879 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A185879() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(k == 1 ? (n == 1 ? 1 : 0) : (n == 1 ? 2L * (k - 1) : 2));
  }
}
