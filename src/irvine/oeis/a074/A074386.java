package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A074386 Numbers n such that sigma(n) is the square of a prime.
 * @author Sean A. Irvine
 */
public class A074386 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mVerbose && mN % 1000000 == 0) {
        System.err.println("[" + mN + "]");
      }
      final Z sigma = Jaguar.factor(mN).sigma();
      final Z[] p = sigma.sqrtAndRemainder();
      if (p[1].isZero() && p[0].isPrime()) {
        return Z.valueOf(mN);
      }
    }
  }

}
