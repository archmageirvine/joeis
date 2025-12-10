package irvine.oeis.a391;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A391050 Greatest prime q such that A391049(n)^2 - 8*q = s^2 for some s &gt; 0.
 * @author Sean A. Irvine
 */
public class A391050 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mA = new A391049();

  @Override
  public Z next() {
    final Z t = mA.next().square();
    long p = t.divide(8).longValueExact() + 1;
    while (true) {
      p = mPrime.prevPrime(p);
      if (Predicates.SQUARE.is(t.subtract(8 * p))) {
        return Z.valueOf(p);
      }
    }
  }
}
