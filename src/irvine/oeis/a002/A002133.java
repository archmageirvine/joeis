package irvine.oeis.a002;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002133 Number of partitions of n with exactly two part sizes.
 * @author Sean A. Irvine
 */
public class A002133 extends Sequence1 {

  private long mN = 0;

  private final HashMap<Long, Long> mTau = new HashMap<>();

  private long tau(final long n) {
    final Long r = mTau.get(n);
    if (r != null) {
      return r;
    }
    final long t = Functions.SIGMA0.l(n);
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
    return d(mN).add(tau(mN)).subtract(Functions.SIGMA1.z(mN)).divide2();
  }
}
