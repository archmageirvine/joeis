package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007529 Prime triples: p; p+2 or p+4; p+6 all prime.
 * @author Sean A. Irvine
 */
public class A007529 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 4;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime(mP + 6) && (mPrime.isPrime(mP + 2) || mPrime.isPrime(mP + 4))) {
        return Z.valueOf(mP);
      }
    }
  }
}
