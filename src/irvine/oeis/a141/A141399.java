package irvine.oeis.a141;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A141399 Positive integers k such that all the distinct primes that divide k or k+1 are members of a set of consecutive primes. In other words, k is included if and only if k*(k+1) is contained in sequence A073491.
 * @author Sean A. Irvine
 */
public class A141399 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private long[] mFactors = ZUtils.toLong(Jaguar.factor(1).toZArray());

  @Override
  public Z next() {
    while (true) {
      final long[] prev = mFactors;
      mFactors = ZUtils.toLong(Jaguar.factor(++mN).toZArray());
      if (is(prev, mFactors)) {
        return Z.valueOf(mN - 1);
      }
    }
  }

  private boolean is(final long[] a, final long[] b) {
    long p = 2;
    int k = 0;
    int j = 0;
    while (k < a.length || j < b.length) {
      boolean ok = false;
      if (k < a.length && a[k] == p) {
        ok = true;
        ++k;
      }
      if (j < b.length && b[j] == p) {
        ok = true;
        ++j;
      }
      if (!ok) {
        return false;
      }
      p = mPrime.nextPrime(p);
    }
    return true;
  }
}
