package irvine.oeis.a394;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394048 The product of the smallest primes in every congruence class modulo n which are relatively prime to n.
 * @author Sean A. Irvine
 */
public class A394048 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = 1; k < mN; ++k) {
      if (Functions.GCD.l(k, mN) == 1) {
        long j = k;
        while (!mPrime.isPrime(j)) {
          j += mN;
        }
        prod = prod.multiply(j);
      }
    }
    return prod;
  }
}
