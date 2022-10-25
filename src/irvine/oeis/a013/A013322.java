package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A013322 Golomb-type sequence over triangular numbers.
 * @author Sean A. Irvine
 */
public class A013322 extends MemorySequence {

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
      mN2 = Z.valueOf(++mN).multiply(mN + 1).divide2();
    }
    return mN2;
  }
}
