package irvine.oeis.a080;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003022.
 * @author Sean A. Irvine
 */
public class A080373 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mM = 3;
  private long mP = 5;

  private boolean is(final long n, final long p) {
    long g = p - 1;
    for (long k = 1, q = mPrime.nextPrime(p); k < n; ++k, q = mPrime.nextPrime(q)) {
      g = Functions.GCD.l(g, q - 1);
      if (g <= 2) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mN, mP)) {
      ++mM;
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(mM);
  }
}
