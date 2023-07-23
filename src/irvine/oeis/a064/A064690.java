package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A064690 Define a sequence of fractions by x(m+1) = (x(m)^2+x(m)-1)/(x(m)+1) with x(1)=1; sequences gives values of n such that sgn(x(n))&lt;&gt;sgn(x(n-1)).
 * @author Sean A. Irvine
 */
public class A064690 extends Sequence1 {

  // Direct iteration of this sequence using rationals is very slow.
  // Here we use constructible reals, but that is also slow.
  // Later terms have been computed by setting a high precision in GP/PARI.

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;
  private CR mX = CR.ONE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final CR y = mX;
      mX = mX.subtract(mX.add(CR.ONE).inverse());
      if (y.signum() != mX.signum()) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 1000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}
