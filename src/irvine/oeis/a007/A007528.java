package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007528.
 * @author Sean A. Irvine
 */
public class A007528 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 4;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if ((mP % 6) == 5) {
        return Z.valueOf(mP);
      }
    }
  }
}
