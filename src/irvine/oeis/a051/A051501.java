package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051501 Bertrand primes III: a(n+1) is the smallest prime &gt; 2^a(n).
 * @author Sean A. Irvine
 */
public class A051501 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mPrime.nextPrime(Z.ONE.shiftLeft(mA.intValueExact()));
    return mA;
  }
}

