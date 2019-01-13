package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007459.
 * @author Sean A. Irvine
 */
public class A007459 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mS = Z.ONE;
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mS.mod(mP - 1) == 0) {
        final Z p = Z.valueOf(mP);
        mS = mS.multiply(p.square());
        return p;
      }
    }
  }
}

