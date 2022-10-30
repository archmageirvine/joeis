package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060180.
 * @author Sean A. Irvine
 */
public class A060181 extends Sequence1 {

  // After Robert Israel

  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 1;
    Z t = Z.ONE;
    while (true) {
      p = mPrime.nextPrime(p);
      if (p > mN) {
        return t;
      }
      long q = p;
      for (int k = 1; k <= mN / p; ++k, q *= p) {
        t = t.add(F.factorial(mN).divide(F.factorial((int) (mN - k * p)).multiply(q).multiply(F.factorial(k))));
      }
    }
  }
}
