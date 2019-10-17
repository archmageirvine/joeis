package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026903 <code>a(n)</code> is the number of multisets S of positive integers satisfying <code>E(S)=n</code>, where E <code>= 2nd</code> elementary symmetric function.
 * @author Sean A. Irvine
 */
public class A026903 implements Sequence {

  // After Andrew Howroyd

  private long mN = 0;

  private Z recurse(final long lim, final long s1, final long s2) {
    if (s2 == mN) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 1; k <= Math.min((mN - s2) / s1, lim); ++k) {
      sum = sum.add(recurse(k, s1 + k, s2 + s1 * k));
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(recurse(k, k, 0));
    }
    return sum;
  }
}
