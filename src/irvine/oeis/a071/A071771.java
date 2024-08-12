package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A071771 Least k &gt; 0 such that the nextprime(k*primorial(n)) - k*primorial(n) is composite.
 * @author Sean A. Irvine
 */
public class A071771 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    final Z primorial = Functions.PRIMORIAL_COUNT.z(++mN);
    long k = 0;
    while (true) {
      final Z kp = primorial.multiply(++k);
      final Z t = mPrime.nextPrime(kp).subtract(kp);
      if (!Z.ONE.equals(t) && !t.isProbablePrime()) {
        return Z.valueOf(k);
      }
      if (mVerbose && k % 100000 == 0) {
        StringUtils.message("n=" + mN + " search completed to k=" + k);
      }
    }
  }
}
