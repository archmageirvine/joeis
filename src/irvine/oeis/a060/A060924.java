package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.memory.MemorySequence;

/**
 * A060924 Bisection of Lucas triangle A060922: odd-indexed members of column sequences of A060922 (not counting leading zeros).
 * @author Sean A. Irvine
 */
public class A060924 extends Sequence0 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A060922());
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mA.a((2 * mN - mM + 1) * (2 * mN - mM + 2) / 2 + mM);
  }
}

