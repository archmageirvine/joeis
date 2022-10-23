package irvine.oeis.a020;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020394 Numbers k such that the continued fraction for sqrt(k) has period 55.
 * @author Sean A. Irvine
 */
public class A020394 extends Sequence1 {

  private Z mN = Z.valueOf(2380);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        if (conv.size() == 56) {
          return mN;
        }
      }
    }
  }
}
