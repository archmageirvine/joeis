package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence0;

/**
 * A060102 Bisection of triangle A060098: even-indexed members of column sequences of A060098 (not counting leading zeros).
 * @author Sean A. Irvine
 */
public class A060102 extends Sequence0 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A060098());
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    final int k = (2 * mN - mM) * (2 * mN - mM + 1) / 2 + mM;
    return mA.a(k);
  }
}
