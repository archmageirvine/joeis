package irvine.oeis.a002;

import irvine.math.LongUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002729.
 * @author Sean A. Irvine
 */
public class A002729 implements Sequence {

  // After maple program by Pab Ter

  private int mN = -1;

  private long m(final long k, final long l) {
    Z s = Z.ONE;
    long e = 1;
    Z kp = Z.ONE;
    while (true) {
      if (s.mod(l) == 0) {
        return e;
      }
      kp = kp.multiply(k);
      s = s.add(kp);
      ++e;
    }
  }

  private int c(final long k, final long t, final long p) {
    Q s = Q.ZERO;
    for (long u = 0; u < p; ++u) {
      s = s.add(new Q(1, m(k, p / LongUtils.gcd(p, u * (k - 1) + t))));
    }
    return s.toZ().intValueExact();
  }

  private Z n(final long p) {
    if (p <= 3) {
      return Z.valueOf(p + 1);
    }
    Z s = Z.ZERO;
    for (long t = 0; t < p; ++t) {
      for (long k = 1; k < p; ++k) {
        if (LongUtils.gcd(p, k) == 1) {
          s = s.add(Z.ONE.shiftLeft(c(k, t, p)));
        }
      }
    }
    return s.divide(p).divide(LongUtils.phi(p));
  }

  @Override
  public Z next() {
    return n(++mN);
  }
}
