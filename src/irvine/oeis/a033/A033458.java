package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000290;

/**
 * A033458 AND-convolution of squares A000290 with themselves.
 * @author Sean A. Irvine
 */
public class A033458 implements Sequence {

  private final MemorySequence mSquares = MemorySequence.cachedSequence(new SkipSequence(new A000290(), 1));
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(mSquares.a(k).and(mSquares.a(mN - k)));
    }
    return sum;
  }
}

