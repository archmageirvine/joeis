package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075169.
 * @author Sean A. Irvine
 */
public class A075232 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 8;

  @Override
  public Z next() {
    while (true) {
      final Z k = Z.valueOf(++mN).pow(9);
      if (mPrime.prevPrime(k).add(mPrime.nextPrime(k)).equals(k.multiply2())) {
        return Z.valueOf(mN);
      }
    }
  }
}
