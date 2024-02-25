package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a246.A246547;
import irvine.util.string.StringUtils;

/**
 * A068583 Let p and q be distinct primes such that p^x - q^y = 2^h with h&gt;=0, x&gt;1, y&gt;1. Sequence gives p^x arranged in increasing order.
 * @author Sean A. Irvine
 */
public class A068583 extends A246547 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private Z mLim = Z.valueOf(100000);

  @Override
  public Z next() {
    // Note this method is not correct if it is ever possible for more than one q^y to exist for p^x
    while (true) {
      final Z px = super.next();
      final Sequence seq = new A246547();
      Z qy;
      while (!(qy = seq.next()).equals(px)) {
        if (px.subtract(qy).bitCount() == 1 && Z.ONE.equals(px.gcd(qy))) {
          return px;
        }
      }
      if (mVerbose && px.compareTo(mLim) > 0) {
        StringUtils.message("Search completed to " + px);
        mLim = mLim.multiply2();
      }
    }
  }
}
