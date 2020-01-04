package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000108;

/**
 * A028364.
 * @author Sean A. Irvine
 */
public class A028364 implements Sequence {

  private final MemorySequence mCatalan = MemorySequence.cachedSequence(new A000108());
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mM; ++k) {
      sum = sum.add(mCatalan.a(mN - k).multiply(mCatalan.a(k)));
    }
    return sum;
  }
}

