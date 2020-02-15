package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;

/**
 * A002584 Largest prime factor of product of first n primes <code>- 1</code>, or 1 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A002584 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private Z mF = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    mN = mPrime.nextPrime(mN);
    mF = mF.multiply(mN);
    final Z t = mF.subtract(1);
    if (mVerbose) {
      System.out.println("Doing: " + mN + "#-1=" + t);
    }
    return A002582.lpf(t);
  }
}
