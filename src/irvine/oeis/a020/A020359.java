package irvine.oeis.a020;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020359 Numbers k such that the continued fraction for sqrt(k) has period 20.
 * @author Sean A. Irvine
 */
public class A020359 extends Sequence1 {

  private Z mN = Z.valueOf(150);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        if (conv.size() == 21) {
          return mN;
        }
      }
    }
  }
}
