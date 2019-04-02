package irvine.oeis.a010;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010338 Numbers n such that continued fraction for sqrt(n) has period 7.
 * @author Sean A. Irvine
 */
public class A010338 implements Sequence {

  private Z mN = Z.valueOf(57);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!Z.ZERO.equals(mN.sqrtAndRemainder()[1])) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        if (conv.size() == 8) {
          return mN;
        }
      }
    }
  }
}
