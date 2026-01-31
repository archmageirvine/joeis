package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A391117 Powers of 7 that do not contain the digit 7 (in base 10).
 * @author Sean A. Irvine
 */
public class A391117 extends Sequence1 {

  private static final int MASK7 = 0b0010000000;
  private static final long SMALL_MOD = 1000000000000000000L; // 7*10^18 < 2^63
  private static final Z BIG_MOD = Z.TEN.pow(1000);
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = -1;
  private long mProd = 1;

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      return Z.ONE;
    }
    while (true) {
      ++mN;
      mProd *= 7;
      mProd %= SMALL_MOD;
      if ((Functions.SYNDROME.i(mProd) & MASK7) == 0
        && (Functions.SYNDROME.i(Z.SEVEN.modPow(mN, BIG_MOD)) & MASK7) == 0) {
        if (mVerbose) {
          StringUtils.message("7^" + mN + " survived modulo tests");
        }
        if ((Functions.SYNDROME.i(Z.SEVEN.pow(mN)) & MASK7) == 0) {
          return Z.SEVEN.pow(mN);
        }
        if (mVerbose) {
          StringUtils.message("7^" + mN + " failed full test");
        }
      }
      if (mVerbose && mN % 100000 == 0) {
        StringUtils.message("Search completed to 7^" + mN);
      }
    }
  }
}
