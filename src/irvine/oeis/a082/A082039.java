package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A082039 Symmetric square array defined by T(n,k)=(k^2*n^2 + kn + 1), read by antidiagonals.
 * @author Georg Fischer
 */
public class A082039 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A082039() {
    super(0, 0, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf((long) n * n).multiply((long) k * k).add((long) n * k + 1);
  }
}
