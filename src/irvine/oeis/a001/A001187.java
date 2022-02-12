package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A001187 Number of connected labeled graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A001187 extends MemorySequence {

  protected int mN = -1;

  @Override
  protected Z computeNext() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      final int sh = (mN - k - 1) * (mN - k) / 2;
      s = s.subtract(Binomial.binomial(mN, k).multiply(k).multiply(get(k)).shiftLeft(sh));
    }
    if (mN > 0) {
      s = s.divide(mN);
    }
    return s.add(Z.ONE.shiftLeft((mN - 1) * mN / 2));
  }
}
