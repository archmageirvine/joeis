package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007529 Prime triples: n; <code>n+2</code> or <code>n+4; n+6</code> all prime.
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
