package irvine.oeis.a286;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A286100 Square array A(n,k): If n = k, then A(n,k) = n, otherwise 0, read by antidiagonals as A(1,1), A(1,2), A(2,1), A(1,3), A(2,2), A(3,1), etc.
 * read by antidiagonals as A(1, 1), A(1, 2), A(2, 1), A(1, 3), A(2, 2), A(3, 1), etc.
 * @author Georg Fischer
 */
public class A286100 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A286100() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return n == k ? Z.valueOf(n) : Z.ZERO;
  }
}
