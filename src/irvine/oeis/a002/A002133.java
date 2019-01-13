package irvine.oeis.a002;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashMap;

/**
 * A002133.
 * @author Sean A. Irvine
 */
public class A002133 implements Sequence {

  private long mN = 0;

  private final HashMap<Long, Long> mTau = new HashMap<>();

  private long tau(final long n) {
    final Long r = mTau.get(n);
    if (r != null) {
      return r;
    }
    final long t = Cheetah.factor(n).sigma0();
    mTau.put(n, t);
    return t;
  }

  private Z d(final long n) {
    Z s = Z.ZERO;
    for (long j = 1; j < n; ++j) {
      s = s.add(tau(j) * tau(n - j));
    }
    return s;
  }

  @Override
  public Z next() {
    ++mN;
    return d(mN).add(tau(mN)).subtract(Cheetah.factor(mN).sigma()).divide(2);
  }
}
