package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

import java.util.ArrayList;

/**
 * A000219 Number of planar partitions (or plane partitions) of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A000219 extends MemorySequence {

  private int mN = -1;
  private final ArrayList<Z> mSigma2 = new ArrayList<>();

  @Override
  protected Z computeNext() {
    if (++mN == 0) {
      mSigma2.add(Z.ONE);
      return Z.ONE;
    }
    mSigma2.add(Cheetah.factor(mN).sigma2());
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(get(mN - k).multiply(mSigma2.get(k)));
    }
    return sum.divide(mN);
  }
}

