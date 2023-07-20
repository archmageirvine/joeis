package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a000.A000367;

/**
 * A061576 Smallest prime of irregularity index n.
 * @author Sean A. Irvine
 */
public class A061576 extends AbstractSequence {

  private int mN = -2;

  /** Construct the sequence. */
  public A061576() {
    super(-1);
  }

  private final MemorySequence mB = MemorySequence.cachedSequence(new A000367());
  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    if (++mN <= 0) {
      return mN == 0 ? Z.THREE : Z.TWO;
    }
    while (true) {
      mP = mPrime.nextPrime(mP);
      int cnt = 0;
      for (int k = 1; k <= (mP - 3) / 2; ++k) {
        if (mB.a(k).mod(mP) == 0 && ++cnt > mN) {
          break;
        }
      }
      if (cnt == mN) {
        return Z.valueOf(mP);
      }
    }
  }
}
