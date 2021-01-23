package irvine.oeis.a010;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010339 Numbers n such that continued fraction for sqrt(n) has period 9.
 * @author Sean A. Irvine
 */
public class A010339 implements Sequence {

  private Z mN = Z.valueOf(105);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        if (conv.size() == 10) {
          return mN;
        }
      }
    }
  }
}
