package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007700 Numbers n such that <code>n, 2n+1,</code> and <code>4n+3</code> all prime.
 * @author Sean A. Irvine
 */
public class A007700 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime(4 * mP + 3) && mPrime.isPrime(2 * mP + 1)) {
        return Z.valueOf(mP);
      }
    }
  }
}
