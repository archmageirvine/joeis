package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390512 The all-integers indexing of lexicographically ordered 01 words; a bijection from the positive integers to the integers.
 * @author Sean A. Irvine
 */
public class A390512 extends Sequence1 {

  private long mPos = 0;
  private long mNeg = 1;
  private boolean mS = true;
  private long mM = -1;
  private long mLim = 1;

  @Override
  public Z next() {
    if (++mM >= mLim) {
      if (!mS) {
        mLim *= 2;
      }
      mM = 0;
      mS = !mS;
    }
    return Z.valueOf(mS ? --mNeg : ++mPos);
  }
}
