package irvine.oeis.a029;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029834 A discrete version of the Mangoldt function: if n is prime then <code>floor(log(n))</code> else 0.
 * @author Sean A. Irvine
 */
public class A029834 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    return mPrime.isPrime(++mN) ? CR.valueOf(mN).log().floor() : Z.ZERO;
  }
}
