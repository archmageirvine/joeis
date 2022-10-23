package irvine.oeis.a059;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059751 Grimm numbers (2): a(n) = largest k so that for each composite m in {n+1, n+2, ..., n+k} there corresponds a different divisor d_m with 1 &lt; d_m &lt; m.
 * @author Sean A. Irvine
 */
public class A059751 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mBestK = 0;

  private void search(final Set<Long> used, final int k) {
    if (k > mBestK) {
      mBestK = k;
    }
    final long t = mN + k + 1;
    if (mPrime.isPrime(t)) {
      search(used, k + 1);
    } else {
      for (final Z pp : Jaguar.factor(t).divisors()) {
        final long p = pp.longValue();
        if (p > 1 && p < t && used.add(p)) {
          search(used, k + 1);
          used.remove(p);
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mBestK = 0;
    search(new HashSet<>(), 0);
    return Z.valueOf(mBestK);
  }
}
