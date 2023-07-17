package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026982 a(n) = Sum_{k=0..n-1} T(n,k) * T(n,k+1), with T given by A026670.
 * @author Sean A. Irvine
 */
public class A026982 extends A026670 {

  /** Construct the sequence. */
  public A026982() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, mN - k - 1)));
    }
    return sum;
  }
}
