package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059784 a(n+1) = nextprime(a(n)^2). Smallest prime following the square of previous prime. Initial value = 2.
 * @author Sean A. Irvine
 */
public class A059784 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mPrime.nextPrime(mA.square());
    return mA;
  }
}
