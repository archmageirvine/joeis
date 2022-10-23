package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A058998 Least exponent k for which n^k reversed (leading zeros are not allowed) is a prime, or 0 if impossible.
 * @author Sean A. Irvine
 */
public class A058998 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1 || mN % 3 == 0 || mN % 10 == 0 || mN % 11 == 0) {
      return mN == 3 || mN == 11 ? Z.ONE : Z.ZERO;
    }
    long k = 0;
    Z n = Z.ONE;
    while (true) {
      ++k;
      n = n.multiply(mN);
      if (ZUtils.reverse(n).isProbablePrime()) {
        return Z.valueOf(k);
      }
      if (mVerbose && k % 250 == 0) {
        StringUtils.message("n=" + mN + " search completed to " + k);
      }
    }
  }
}
// Do[ If[ Mod[ n, 3 ] != 0 && Mod[ n, 10 ] != 0 && Mod[ n, 11 ] != 0, k = 2; While[ !PrimeQ[ ToExpression[ StringReverse[ ToString[ n^k ] ] ] ], k++ ]; Print[ k ], Print[ 0 ] ], {n, 2, 33} ]
