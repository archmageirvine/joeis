package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A051034 Minimal number of primes needed to sum to n.
 * @author Sean A. Irvine
 */
public class A051034 extends Sequence2 {

  // Assuming Goldbach Conjecture

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      return Z.ONE;
    } else if ((mN & 1) == 0 || mPrime.isPrime(mN - 2)) {
      return Z.TWO;
    } else {
      return Z.THREE;
    }
  }
}
