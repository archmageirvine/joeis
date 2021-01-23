package irvine.oeis.a020;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020399 Numbers n such that continued fraction for sqrt(n) has period 60.
 * @author Sean A. Irvine
 */
public class A020399 implements Sequence {

  private Z mN = Z.valueOf(918);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        if (conv.size() == 61) {
          return mN;
        }
      }
    }
  }
}
