package irvine.oeis.a342;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A342138 Array T(n,k) = (n+k)*(3*n+3*k-5)/2 + (3*k+1), read by ascending antidiagonals.
 * @author Georg Fischer
 */
public class A342138 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A342138() {
    super(0, 0, 1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf((n + k) * (3L * n + 3L * k - 5) / 2 + (3L * k + 1));
  }
}
