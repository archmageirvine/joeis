package irvine.oeis.a010;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010337 Numbers n such that continued fraction for <code>sqrt(n)</code> has period 5.
 * @author Sean A. Irvine
 */
public class A010337 implements Sequence {

  private Z mN = Z.valueOf(12);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        if (conv.size() == 6) {
          return mN;
        }
      }
    }
  }
}
