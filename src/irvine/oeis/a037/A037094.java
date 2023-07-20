package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000032;

/**
 * A037094 "Sloping binary representation" of Lucas numbers (A000032), slope = +1.
 * @author Sean A. Irvine
 */
public class A037094 extends Sequence0 {

  private final MemorySequence mLucas = MemorySequence.cachedSequence(new A000032());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mLucas.a(k + mN).bitLength(); ++k) {
      if (mLucas.a(k + mN).testBit(k)) {
        sum = sum.setBit(k);
      }
    }
    return sum;
  }
}
