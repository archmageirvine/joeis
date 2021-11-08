package irvine.oeis.a185;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A185917 Weight array of max{n,k}, by antidiagonals.
 *
 * @author Georg Fischer
 */
public class A185917 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A185917() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(n == 1 || k == 1 ? 1 : (n == k ? -1 : 0));
  }
}
