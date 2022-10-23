package irvine.oeis.a010;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A010342 Numbers k such that all terms in the periodic part of the continued fraction for sqrt(k) except the final term are 1.
 * @author Sean A. Irvine
 */
public class A010342 extends Sequence1 {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        boolean ok = true;
        final List<Z> c = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        if (c.size() > 2) {
          for (int k = 1; k < c.size() - 1; ++k) {
            if (!c.get(k).equals(Z.ONE)) {
              ok = false;
              break;
            }
          }
          if (ok) {
            return mN;
          }
        }
      }
    }
  }
}
