package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000244;

/**
 * A037095 "Sloping binary representation" of powers of 3 (A000244), slope = -1.
 * @author Sean A. Irvine
 */
public class A037095 extends Sequence0 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A000244());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      if (mA.a(mN - k).testBit(k)) {
        sum = sum.setBit(k);
      }
    }
    return sum;
  }
}
