package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002585 Largest prime factor of 1 + (product of first n primes).
 * @author Sean A. Irvine
 */
public class A002585 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
    } else {
      mN = mPrime.nextPrime(mN);
      mF = mF.multiply(mN);
    }
    final Z t = mF.add(1);
    if (mVerbose) {
      System.out.println("Doing: " + mN + "#+1=" + t);
    }
    return Functions.GPF.z(t);
  }
}
