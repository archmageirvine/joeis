package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075365 extends Sequence1 {

  private final Fast mPrime = new Fast();
  protected int mN = 0;

  @Override
  public Z next() {
    return ++mN == 10 ? Z.FIVE : mN == 1 ? Z.ZERO : Z.valueOf(2 * mPrime.prevPrime(mN + 1) - mN);
  }
}
