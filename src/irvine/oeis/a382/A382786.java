package irvine.oeis.a382;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A382786 Numbers k such that 5^k + k is prime.
 * @author Sean A. Irvine
 */
public class A382786 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private Z mA = Z.FIVE.pow(7953);
  private long mK = 7953;

  @Override
  public Z next() {
    while (true) {
      if (++mK > 0) {
        mA = mA.multiply(5);
      }
      if (mVerbose) {
        StringUtils.message("Trying k=" + mK);
      }
      if (mA.add(mK).isProbablePrime()) {
        return Z.valueOf(mK);
      }
    }
  }
}
