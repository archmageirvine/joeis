package irvine.oeis.a020;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020357.
 * @author Sean A. Irvine
 */
public class A020357 implements Sequence {

  private Z mN = Z.valueOf(138);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!Z.ZERO.equals(mN.sqrtAndRemainder()[1])) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        if (conv.size() == 19) {
          return mN;
        }
      }
    }
  }
}
