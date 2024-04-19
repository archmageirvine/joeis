package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060181 Number of permutations in the symmetric group S_n whose order is 1 or prime.
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
        t = t.add(Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z((int) (mN - k * p)).multiply(q).multiply(Functions.FACTORIAL.z(k))));
      }
    }
  }
}
