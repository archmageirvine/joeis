package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057556 Lexicographic ordering of M x M x M, where M={0,1,2,...}.
 * @author Sean A. Irvine
 */
public class A057556 implements Sequence {

  private long mN = -1;
  private long mM = 0;
  private long mL = 0;
  private int mPos = -1;

  @Override
  public Z next() {
    if (++mPos == 3) {
      mPos = 0;
    }
    if (mPos == 0) {
      if (++mM + mL > mN) {
        if (++mL > mN) {
          ++mN;
          mL = 0;
        }
        mM = 0;
      }
      return Z.valueOf(mL);
    } else if (mPos == 1) {
      return Z.valueOf(mM);
    } else {
      return Z.valueOf(mN - mM - mL);
    }
  }
}
