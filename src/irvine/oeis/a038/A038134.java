package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038134 From a subtractive Goldbach conjecture: cluster primes.
 * @author Sean A. Irvine
 */
public class A038134 extends A038133 {

  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (isClusterPrime(mP)) {
        return Z.valueOf(mP);
      }
    }
  }
}
