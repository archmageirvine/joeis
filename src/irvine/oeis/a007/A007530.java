package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007530 Prime quadruples: numbers k such that k, k+2, k+6, k+8 are all prime.
 * @author Sean A. Irvine
 */
public class A007530 implements Sequence {

  protected final Fast mPrime = new Fast();
  private long mP = 4;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime(mP + 8) && mPrime.isPrime(mP + 6) && mPrime.isPrime(mP + 2)) {
        return Z.valueOf(mP);
      }
    }
  }
}
