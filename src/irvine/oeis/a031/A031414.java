package irvine.oeis.a031;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031414 Numbers n such that continued fraction for <code>sqrt(n)</code> has odd period and a pair of central terms both equal to 1.
 * @author Sean A. Irvine
 */
public class A031414 implements Sequence {

  private Z mN = Z.ZERO;

  protected Z target() {
    return Z.ONE;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        final int s = conv.size();
        if ((s & 1) == 0
          && target().equals(conv.get((s + 1) / 2))) {
          //&& target().equals(conv.get(s / 2 - 1))) {
          return mN;
        }
      }
    }
  }
}
