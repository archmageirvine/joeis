package irvine.oeis.a020;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020350 Numbers n such that continued fraction for sqrt(n) has period 11.
 * @author Sean A. Irvine
 */
public class A020350 implements Sequence {

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
