package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * A060393.
 * @author Sean A. Irvine
 */
public class A060393 extends A060380 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final Z m = super.next();
    long k = -1;
    while (true) {
      if (m.add(++k * k + k).mod(mP) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}

