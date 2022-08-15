package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A058760 Integers whose set of prime factors (taken with multiplicity) uses each digit exactly once (i.e., is pandigital) in some base b &gt; 1. Numbers are expressed in base 10.
 * @author Sean A. Irvine
 */
public class A058760 implements Sequence {

  private long mN = 1;

  private boolean is(final long[] primes, final int b) {
    final int[] counts = new int[b];
    for (final long p : primes) {
      final int[] c = ZUtils.digitCounts(p, b);
      for (int k = 0; k < c.length; ++k) {
        counts[k] += c[k];
        if (counts[k] > 1) {
          return false;
        }
      }
    }
    for (final int c : counts) {
      if (c != 1) {
        return false;
      }
    }
    return true;
  }

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    if (!fs.isSquareFree()) {
      return false;
    }
    // Work about approximate length of factorization in base b
    final long[] p = ZUtils.toLong(fs.toZArray());
    double logp = 0;
    for (final long q : p) {
      logp += Math.log(q) + 1; // +1 safety
    }
    for (int b = 2; (b - 1) * Math.log(b) <= logp; ++b) {
      if (is(p, b)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
