package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026975 a(n) = Sum_{k=0..n} (k+1) * A026648(n,k).
 * @author Sean A. Irvine
 */
public class A026975 extends A026648 {

  /** Construct the sequence. */
  public A026975() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k).multiply(k + 1));
    }
    return sum;
  }
}
