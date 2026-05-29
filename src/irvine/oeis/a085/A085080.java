package irvine.oeis.a085;

import irvine.factor.util.FactorUtils;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085080 Smallest k such that n, k and n+k have the same prime signature (canonical form), or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A085080 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    if (mN < 1000 && Predicates.SQUARE.is(mN)) {
      return Z.ZERO;
    }
    final boolean prime = Predicates.PRIME.is(mN);
    if (!prime && Predicates.PRIME_POWER.is(mN)) {
      return Z.ZERO;
    }
    if (mN > 2 && prime && !Predicates.PRIME.is(mN + 2)) {
      return Z.ZERO;
    }
    final Z s = FactorUtils.leastPrimeSignature(mN);
    long k = 1;
    while (true) {
      if (s.equals(FactorUtils.leastPrimeSignature(++k)) && s.equals(FactorUtils.leastPrimeSignature(mN + k))) {
        return Z.valueOf(k);
      }
    }
  }
}

