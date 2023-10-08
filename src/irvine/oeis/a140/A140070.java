package irvine.oeis.a140;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A140070 Triangle read by rows, iterates of matrix X * [1,0,0,0,...], where X = an infinite lower bidiagonal matrix with [1,3,1,3,1,3,...] in the main diagonal and [1,1,1,...] in the subdiagonal.
 * @author Georg Fischer
 */
public class A140070 extends BaseTriangle {

  /** Construct the sequence. */
  public A140070() {
    super(1, 0, 0);
    hasRAM(false);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return k < 0 || k > n ? Z.ZERO : (k == 0 || k == n
      ? Z.ONE
      : triangleElement(n - 1, k).multiply(4).subtract(triangleElement(n - 2, k).multiply(3)).add(triangleElement(n - 2, k - 2)));
  }
}
