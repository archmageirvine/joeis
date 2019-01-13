package irvine.oeis.a010;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010342.
 * @author Sean A. Irvine
 */
public class A010342 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      mN.sqrt();
      if (mN.auxiliary() == 0) {
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
