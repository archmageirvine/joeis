package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A076207 Triangular numbers whose sum of primes from smallest to largest prime factor is triangular and whose sum of composites from smallest to largest prime factor is triangular.
 * @author Sean A. Irvine
 */
public class A076207 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mT = new A000217().skip(2);

  private boolean is(final Z t) {
    Z sumPrimes = Z.ZERO;
    final Z lo = Functions.LPF.z(t);
    final Z hi = Functions.GPF.z(t);
    for (Z p = lo; p.compareTo(hi) <= 0; p = mPrime.nextPrime(p)) {
      sumPrimes = sumPrimes.add(p);
    }
    if (!Predicates.TRIANGULAR.is(sumPrimes)) {
      return false;
    }
    final Z sum = hi.add(lo).multiply(hi.subtract(lo).add(1)).divide2();
    return Predicates.TRIANGULAR.is(sum.subtract(sumPrimes));
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mT.next();
      if (is(t)) {
        return t;
      }
    }
  }
}
