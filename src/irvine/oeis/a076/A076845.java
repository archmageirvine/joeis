package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.string.StringUtils;

/**
 * A076845 Least k&gt;0 such that n^k + n - 1 is prime.
 * @author Sean A. Irvine
 */
public class A076845 extends Sequence2 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    Z v = Z.ONE;
    while (true) {
      ++k;
      v = v.multiply(mN);
      if (v.add(mN - 1).isProbablePrime()) {
        return Z.valueOf(k);
      }
      if (mVerbose && k % 100 == 0) {
        StringUtils.message("n=" + mN + " searched completed to k=" + k);
      }
    }
  }
}
