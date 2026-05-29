package irvine.oeis.a085;

import irvine.factor.util.FactorUtils;
import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A085074 Smallest number a(n) == 1 (mod n) such that the prime signature of n and a(n) is the same.
 * @author Sean A. Irvine
 */
public class A085074 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final Z s = FactorUtils.leastPrimeSignature(++mN);
    long k = 1;
    if (Predicates.PRIME_POWER.is(mN)) {
      // Handle p^e as a special case
      final int e = Functions.VALUATION.i(mN, Functions.LPF.l(mN));
      while (true) {
        k = Functions.NEXT_PRIME.l(k);
        if (LongUtils.modPow(k, e, mN) == 1) {
          return Z.valueOf(k).pow(e);
        }
      }
    }
    while (true) {
      k += mN;
      if (s.equals(FactorUtils.leastPrimeSignature(k))) {
        return Z.valueOf(k);
      }
    }
  }
}

