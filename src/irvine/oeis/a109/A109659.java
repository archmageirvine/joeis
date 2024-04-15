package irvine.oeis.a109;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A109659 Numbers k such that the sum of the digits of sigma(k)^k is divisible by k.
 * @author Sean A. Irvine
 */
public class A109659 extends Sequence1 {

  private int mN = 0;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    while (true) {
      final String s = Functions.SIGMA.z(++mN).pow(mN).toString();
      int digitSum = 0;
      for (int k = 0; k < s.length(); ++k) {
        digitSum += s.charAt(k) - '0';
      }
      if (digitSum % mN == 0) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 1000 == 0) {
        System.err.println("[" + mN + "]");
      }
    }
  }
}

