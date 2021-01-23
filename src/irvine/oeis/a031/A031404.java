package irvine.oeis.a031;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031404 Numbers n such that continued fraction for sqrt(n) has even period 2*m and the m-th term is 1.
 * @author Sean A. Irvine
 */
public class A031404 implements Sequence {

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
        if ((conv.size() & 1) == 1 && target().equals(conv.get(conv.size() / 2))) {
          return mN;
        }
      }
    }
  }
}
