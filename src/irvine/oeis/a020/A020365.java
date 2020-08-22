package irvine.oeis.a020;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020365 Numbers k such that continued fraction for sqrt(k) has period 26.
 * @author Sean A. Irvine
 */
public class A020365 implements Sequence {

  private Z mN = Z.valueOf(210);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        if (conv.size() == 27) {
          return mN;
        }
      }
    }
  }
}
