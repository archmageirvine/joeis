package irvine.oeis.a109;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A109659 Numbers n such that the sum of the digits of sigma(n)^n is divisible by n.
 * @author Sean A. Irvine
 */
public class A109659 implements Sequence {

  private int mN = 0;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    while (true) {
      final String s = Jaguar.factor(++mN).sigma().pow(mN).toString();
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

