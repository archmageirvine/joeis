package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007520.
 * @author Sean A. Irvine
 */
public class A007520 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if ((mP & 7) == 3) {
        return Z.valueOf(mP);
      }
    }
  }
}
