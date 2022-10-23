package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057559 Lexicographic ordering of NxNxNxN, where N={1,2,3,...}.
 * @author Sean A. Irvine
 */
public class A057559 extends Sequence1 {

  private long mN = 3;
  private long mM = 1;
  private long mL = 1;
  private long mK = 1;
  private int mPos = -1;

  @Override
  public Z next() {
    if (++mPos == 4) {
      mPos = 0;
    }
    switch (mPos) {
      case 0:
        if (++mM + mL + mK >= mN) {
          if (++mL + mK + 1 >= mN) {
            if (++mK + 2 >= mN) {
              ++mN;
              mK = 1;
            }
            mL = 1;
          }
          mM = 1;
        }
        return Z.valueOf(mK);
      case 1:
        return Z.valueOf(mL);
      case 2:
        return Z.valueOf(mM);
      default:
        return Z.valueOf(mN - mM - mL - mK);
    }
  }
}
