package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048052 Start of the first occurrence of n consecutive reversible primes (emirps).
 * @author Sean A. Irvine
 */
public class A048052 extends A000040 {

  private int mN = 0;
  private Z mP = super.next();

  private boolean isPrimeChain(Z t, final int n) {
    for (int k = 0; k < n; ++k) {
      final Z reverse = Functions.REVERSE.z(t);
      if (!mPrime.isPrime(reverse)) {
        return false;
      }
      t = mPrime.nextPrime(t);
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (isPrimeChain(mP, mN)) {
        return mP;
      }
      mP = super.next();
    }
  }
}
