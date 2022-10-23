package irvine.oeis.a020;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020350 Numbers k such that the continued fraction for sqrt(k) has period 11.
 * @author Sean A. Irvine
 */
public class A020350 extends Sequence1 {

  private Z mN = Z.valueOf(60);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        if (conv.size() == 12) {
          return mN;
        }
      }
    }
  }
}
