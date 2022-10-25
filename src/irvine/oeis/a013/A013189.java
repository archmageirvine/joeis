package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A013189 All terms are squares and a(n) is length of n-th run.
 * @author Sean A. Irvine
 */
public class A013189 extends MemorySequence {

  private long mN = 0;
  private Z mN2 = Z.ZERO;
  private int mS = 0;
  private long mSRemaining = 0;
  {
    setOffset(1);
    add(Z.ONE);
  }

  @Override
  protected Z computeNext() {
    if (++mSRemaining >= get(mS).longValueExact()) {
      ++mS;
      mSRemaining = 0;
      mN2 = Z.valueOf(++mN).square();
    }
    return mN2;
  }
}
