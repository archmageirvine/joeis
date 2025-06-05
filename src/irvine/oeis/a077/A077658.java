package irvine.oeis.a077;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A077658 Least composite number not congruent to 0 (modulo the first n primes) which contains its greatest proper divisor as a substring of itself, both in base two.
 * @author Sean A. Irvine
 */
public class A077658 extends A002808 {

  private final Fast mPrime = new Fast();
  private Z mC = super.next();
  private long mP = 0;

  private boolean isPRough(final Z n, final long p) {
    for (long q = 2; q <= p; q = mPrime.nextPrime(q)) {
      if (n.mod(q) == 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mP == 0) {
      mP = 1;
      return Z.FOUR;
    }
    mP = mPrime.nextPrime(mP);
    while (true) {
      while (!isPRough(mC, mP)) {
        mC = super.next();
      }
      final Z t = mC.divide(Functions.LPF.z(mC));
      if (mC.toString(2).contains(t.toString(2))) {
        return mC;
      }
      mC = super.next();
    }
  }
}
