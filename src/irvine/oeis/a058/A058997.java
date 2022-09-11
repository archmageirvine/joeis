package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A058997 Least power k greater than 1 for which n^k reversed is a prime, or 0 if impossible.
 * @author Sean A. Irvine
 */
public class A058997 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1 || mN % 3 == 0 || mN % 10 == 0 || mN % 11 == 0) {
      return Z.ZERO;
    }
    long k = 1;
    Z n = Z.valueOf(mN);
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
