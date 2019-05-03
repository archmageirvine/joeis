package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002110 Primorial numbers (first <code>definition)</code>: product of first n primes. Sometimes written <code>prime(n)#</code>.
 * @author Sean A. Irvine
 */
public class A002110 implements Sequence {

  private final Fast mPrime = new Fast();
  protected long mP = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mP = mP == 0 ? 1 : mPrime.nextPrime(mP);
    mA = mA.multiply(mP);
    return mA;
  }
}
