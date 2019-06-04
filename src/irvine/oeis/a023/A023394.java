package irvine.oeis.a023;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023394 Prime factors of Fermat numbers.
 * @author Sean A. Irvine
 */
public class A023394 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Z.ONE.equals(new IntegersModMul(mP).order(Z.TWO).makeOdd())) {
        return mP;
      }
    }
  }
}
