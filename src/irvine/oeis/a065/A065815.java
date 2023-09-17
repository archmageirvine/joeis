package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001620;
import irvine.util.string.StringUtils;

/**
 * A065815 Numbers n such that initial n digits in decimal portion of the Euler-Mascheroni constant form a prime number.
 * @author Sean A. Irvine
 */
public class A065815 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Sequence mSeq = new A001620();
  private Z mA = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(10).add(mSeq.next());
      if (mA.isProbablePrime()) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 1000 == 0) {
        StringUtils.message("n=" + mN);
      }
    }
  }
}

