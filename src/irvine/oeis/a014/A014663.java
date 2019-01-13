package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014663.
 * @author Sean A. Irvine
 */
public class A014663 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (!new IntegersModMul(mP).order(Z.TWO).isEven()) {
        return mP;
      }
    }
  }
}

