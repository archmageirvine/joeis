package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * A064743 A064413(n) written in base of primes, read from right to left, written as a string.
 * @author Sean A. Irvine
 */
public class A064743 extends A064413 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(super.next());
    Z p = fs.largestPrimeFactor();
    Z s = Z.ZERO;
    while (p.compareTo(Z.ONE) > 0) {
      final int e = fs.getExponent(p);
      if (e > 9) {
        throw new UnsupportedOperationException();
      }
      s = s.multiply(10).add(e);
      p = mPrime.prevPrime(p);
    }
    return s;
  }
}

