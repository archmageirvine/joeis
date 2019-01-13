package irvine.oeis.a132;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A132421.
 * @author Sean A. Irvine
 */
public class A132421 implements Sequence {

  private long mN = 0;

  private long b(final long n, long k) {
    final long t = n + 1 - k;
    long v = 0;
    while (k > 0) {
      if (LongUtils.gcd(++v, t) == 1) {
        --k;
      }
    }
    return v;
  }

  @Override
  public Z next() {
    ++mN;
    Z lcm = Z.ONE;
    for (long k = 1; k <= mN; ++k) {
      lcm = lcm.lcm(Z.valueOf(b(mN, k)));
    }
    return lcm;
  }
}

