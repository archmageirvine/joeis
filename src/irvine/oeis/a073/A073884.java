package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A073884.
 * @author Sean A. Irvine
 */
public class A073884 implements Sequence {

  private Z mP = Z.TWO;
  private Z mC = Z.THREE;
  private Z mS = null;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    if (mS == null) {
      mS = Z.TWO;
      return Z.TWO;
    }
    if (mPrime.isPrime(mS)) {
      mP = mPrime.nextPrime(mP);
      mS = mS.add(mP);
      return mP;
    } else {
      do {
        mC = mC.add(1);
      } while (mPrime.isPrime(mC));
      mS = mS.add(mC);
      return mC;
    }
  }
}

