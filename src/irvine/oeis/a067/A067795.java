package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067794.
 * @author Sean A. Irvine
 */
public class A067795 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.nextPrime(Jaguar.factor(++mN).sigma()).equals(Z.valueOf(2 * mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
