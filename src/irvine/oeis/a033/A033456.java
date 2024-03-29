package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000290;
import irvine.oeis.memory.MemorySequence;

/**
 * A033456 LCM-convolution of squares A000290 with themselves.
 * @author Sean A. Irvine
 */
public class A033456 extends Sequence0 {

  private final MemorySequence mSquares = MemorySequence.cachedSequence(new A000290().skip(1));
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(mSquares.a(k).lcm(mSquares.a(mN - k)));
    }
    return sum;
  }
}

