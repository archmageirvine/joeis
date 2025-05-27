package irvine.oeis.a077;

import java.util.Comparator;
import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077522 Smallest number beginning with n and having exactly n prime divisors, all distinct.
 * @author Sean A. Irvine
 */
public class A077522 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    final TreeSet<FactorSequence> set = new TreeSet<>(Comparator.comparing(FactorSequence::product));
    final FactorSequence start = new FactorSequence();
    for (long p = 2, k = 0; k < mN; ++k, p = mPrime.nextPrime(p)) {
      start.add(p, FactorSequence.PRIME);
    }
    set.add(start);
    while (true) {
      final FactorSequence fs = set.pollFirst();
      final Z n = fs.product();
      if (n.toString().startsWith(s)) {
        return n;
      }
      final Z[] ps = fs.toZArray();
      final Z q = mPrime.nextPrime(ps[ps.length - 1]);
      for (final Z p : ps) {
        final FactorSequence t = new FactorSequence(fs);
        t.remove(p);
        t.add(q, FactorSequence.PRIME);
        set.add(t);
      }
    }
  }
}
