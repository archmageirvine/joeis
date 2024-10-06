package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A072460 Smallest even nontotient number of which the largest prime divisor equals n-th prime.
 * @author Sean A. Irvine
 */
public class A072460 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mP = 3;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final long q = mP * 2;
    long k = 0;
    while (true) {
      k += q;
      if (Functions.GPF.l(k) == mP && InverseEuler.inversePhi(Z.valueOf(k)).isEmpty()) {
        return Z.valueOf(k);
      }
    }
  }
}
