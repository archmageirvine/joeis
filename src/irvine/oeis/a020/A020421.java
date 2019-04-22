package irvine.oeis.a020;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020421 Numbers n such that continued fraction for <code>sqrt(n)</code> has period 82.
 * @author Sean A. Irvine
 */
public class A020421 implements Sequence {

  private Z mN = Z.valueOf(2163);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!Z.ZERO.equals(mN.sqrtAndRemainder()[1])) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        if (conv.size() == 83) {
          return mN;
        }
      }
    }
  }
}
