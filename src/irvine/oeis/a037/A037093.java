package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000045;
import irvine.oeis.memory.MemorySequence;

/**
 * A037093 "Sloping binary representation" of Fibonacci numbers, slope = +1.
 * @author Sean A. Irvine
 */
public class A037093 extends Sequence0 {

  private final MemorySequence mFibo = MemorySequence.cachedSequence(new A000045());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mFibo.a(k + mN).bitLength(); ++k) {
      if (mFibo.a(k + mN).testBit(k)) {
        sum = sum.setBit(k);
      }
    }
    return sum;
  }
}
