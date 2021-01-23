package irvine.oeis.a020;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020359 Numbers n such that continued fraction for sqrt(n) has period 20.
 * @author Sean A. Irvine
 */
public class A020359 implements Sequence {

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
