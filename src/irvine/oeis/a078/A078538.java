package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A078122.
 * @author Sean A. Irvine
 */
public class A078538 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 6;
    while (true) {
      if (Functions.SIGMA.z(mN, ++k).mod(Functions.PHI.l(k)) == 0) {
        return Z.valueOf(k);
      }
      if (mVerbose && k % 1000000 == 0) {
        StringUtils.message(mN + " search completed to k=" + k);
      }
    }
  }
}

