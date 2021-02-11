package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A038768.
 * @author Sean A. Irvine
 */
public class A038768 extends A002110 {

  private Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z a = super.next().add(mP.square());
      if (a.isProbablePrime()) {
        return a;
      }
    }
  }
}
