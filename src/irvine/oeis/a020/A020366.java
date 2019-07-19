package irvine.oeis.a020;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020366 Numbers n such that continued fraction for <code>sqrt(n)</code> has period 27.
 * @author Sean A. Irvine
 */
public class A020366 implements Sequence {

  private Z mN = Z.valueOf(948);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        if (conv.size() == 28) {
          return mN;
        }
      }
    }
  }
}
