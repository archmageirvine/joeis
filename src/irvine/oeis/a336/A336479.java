package irvine.oeis.a336;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A336479.
 * @author Sean A. Irvine
 */
public class A336479 extends A000045 {

  {
    super.next(); // skip 0
  }
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private Z mFibonorial = Z.ONE;
  private long mP = 1;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mVerbose) {
        System.out.println("[" + mN + "]");
      }
      mP = mPrime.nextPrime(mP);
      mFibonorial = mFibonorial.multiply(super.next());
      if (mFibonorial.add(mP).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
