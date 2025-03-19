package irvine.oeis.a381;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A381815 Smallest k&gt;1 such that 10*k^(3*2^n)+1 is prime.
 * @author Sean A. Irvine
 */
public class A381815 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.multiply2();
    long k = 1;
    while (true) {
      if (Z.valueOf(++k).pow(mA).multiply(10).add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
      if (mVerbose && k % 1000 == 0) {
        StringUtils.message("Search completed to k=" + k);
      }
    }
  }
}
