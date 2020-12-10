package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000244;

/**
 * A037097 Periodic vertical binary vectors of powers of 3, starting from bit-column 2 (halved).
 * @author Sean A. Irvine
 */
public class A037097 implements Sequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A000244());
  private int mN = 1;

  @Override
  public Z next() {
    if (++mN > 32) {
      throw new UnsupportedOperationException();
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < 1 << (mN - 1); ++k) {
      if (mA.a(k).testBit(mN)) {
        sum = sum.setBit(k);
      }
    }
    return sum;
  }
}
