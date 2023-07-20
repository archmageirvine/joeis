package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000244;

/**
 * A037096 Periodic vertical binary vectors computed for powers of 3: a(n) = Sum_{k=0 .. (2^n)-1} (floor((3^k)/(2^n)) mod 2) * 2^k.
 * @author Sean A. Irvine
 */
public class A037096 extends Sequence0 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A000244());
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 31) {
      throw new UnsupportedOperationException();
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < 1 << mN; ++k) {
      if (mA.a(k).testBit(mN)) {
        sum = sum.setBit(k);
      }
    }
    return sum;
  }
}
