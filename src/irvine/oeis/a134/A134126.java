package irvine.oeis.a134;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A134126 Indices k such that the (k+1)st partial sum of primes divided by k is integer.
 * @author Sean A. Irvine
 */
public class A134126 implements Sequence {

  private long mN = 0;
  private Z mP = Z.TWO;
  private Z mS = Z.TWO;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      mS = mS.add(mP);
      if (mS.mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

