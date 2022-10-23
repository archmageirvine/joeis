package irvine.oeis.a038;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038037 Number of labeled rooted compound windmills (mobiles) with n nodes.
 * @author Sean A. Irvine
 */
public class A038037 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z f = Z.ONE;
    for (long k = 0; k <= mN; ++k) {
      if (k > 1) {
        f = f.multiply(k);
      }
      sum = sum.add(Binomial.binomial(mN, k).multiply(Stirling.firstKind(mN - 1, k).abs()).multiply(f));
    }
    return sum;
  }
}
