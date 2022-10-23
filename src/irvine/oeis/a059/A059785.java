package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059785 a(n+1) = prevprime(a(n)^2). Largest prime prior to the square of previous prime. Initial value = 2.
 * @author Sean A. Irvine
 */
public class A059785 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mPrime.prevPrime(mA.square());
    return mA;
  }
}
