package irvine.oeis.a031;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.a000.A000037;

/**
 * A031424 Least term in period of continued fraction for sqrt(n), as n runs through the nonsquares (A000037).
 * @author Sean A. Irvine
 */
public class A031424 extends A000037 {

  protected Z mN;

  @Override
  public Z next() {
    mN = super.next();
    final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
    Z res = conv.get(1);
    for (int k = 2; k < conv.size(); ++k) {
      res = res.min(conv.get(k));
    }
    return res;
  }
}
