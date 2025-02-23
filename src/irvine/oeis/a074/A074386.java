package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074386 Numbers k such that sigma(k) is the square of a prime.
 * @author Sean A. Irvine
 */
public class A074386 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mVerbose && mN % 1000000 == 0) {
        System.err.println("[" + mN + "]");
      }
      final Z sigma = Functions.SIGMA1.z(mN);
      final Z[] p = sigma.sqrtAndRemainder();
      if (p[1].isZero() && p[0].isPrime()) {
        return Z.valueOf(mN);
      }
    }
  }

}
