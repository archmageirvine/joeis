package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057558 Lexicographic ordering of MxMxMxM, where M={0,1,2,...}.
 * @author Sean A. Irvine
 */
public class A057558 implements Sequence {

  private long mN = -1;
  private long mM = 0;
  private long mL = 0;
  private long mK = 0;
  private int mPos = -1;

  @Override
  public Z next() {
    if (++mPos == 4) {
      mPos = 0;
    }
    switch (mPos) {
      case 0:
        if (++mM + mL + mK > mN) {
          if (++mL + mK > mN) {
            if (++mK > mN) {
              ++mN;
              mK = 0;
            }
            mL = 0;
          }
          mM = 0;
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
