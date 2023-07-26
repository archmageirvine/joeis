package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * A064744 A064413(n) written in base of primes, read from right to left, written as n-th row of a table.
 * @author Sean A. Irvine
 */
public class A064744 extends A064413 {

  private final Fast mPrime = new Fast();
  private FactorSequence mFactorSequence;
  private Z mP = Z.ZERO;

  @Override
  public Z next() {
    mP = mPrime.prevPrime(mP);
    if (mP.compareTo(Z.TWO) < 0) {
      mFactorSequence = Jaguar.factor(super.next());
      mP = mFactorSequence.largestPrimeFactor();
    }
    return Z.valueOf(mFactorSequence.getExponent(mP));
  }
}

