package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;
import irvine.util.string.StringUtils;

/**
 * A057616 Lucky numbers that are the product of the first m lucky numbers for some m.
 * @author Sean A. Irvine
 */
public class A057616 extends A000959 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mProd = 1;
  private long mN = -1;

  private long getLucky(final long n) {
    while (n >= mLucky.length()) {
      super.next();
    }
    return mLucky.get(n);
  }

  @Override
  public Z next() {
    while (true) {
      mProd *= getLucky(++mN);
      if (mVerbose) {
        StringUtils.message("Testing: " + mProd);
      }
      long k = mN;
      long l;
      while ((l = getLucky(k)) <= mProd) {
        if (l == mProd) {
          return Z.valueOf(mProd);
        }
        ++k;
      }
    }
  }
}
