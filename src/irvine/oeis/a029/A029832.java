package irvine.oeis.a029;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029832 A discrete version of the Mangoldt function: if n is prime then ceiling(log(n)) else 0.
 * @author Sean A. Irvine
 */
public class A029832 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    return mPrime.isPrime(++mN) ? CR.valueOf(mN).log().ceil() : Z.ZERO;
  }
}
