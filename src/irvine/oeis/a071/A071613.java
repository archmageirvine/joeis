package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071613 a(n) is the smallest prime that is the first of n consecutive primes with equal digit sum.
 * @author Sean A. Irvine
 */
public class A071613 extends A000040 {

  private long mN = 0;
  private long mM = 0;
  private Z mP = null;

  @Override
  public Z next() {
    ++mN;
    while (mM < mN) {
      mP = super.next();
      Z q = mP;
      final long s = Functions.DIGIT_SUM.l(q);
      mM = 0;
      do {
        ++mM;
        q = mPrime.nextPrime(q);
      } while (Functions.DIGIT_SUM.l(q) == s);
    }
    return mP;
  }
}
