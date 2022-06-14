package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057557 Lexicographic ordering of NxNxN, where N={1,2,3,...}.
 * @author Sean A. Irvine
 */
public class A057557 implements Sequence {

  private long mN = 2;
  private long mM = 1;
  private long mL = 1;
  private int mPos = -1;

  @Override
  public Z next() {
    if (++mPos == 3) {
      mPos = 0;
    }
    if (mPos == 0) {
      if (++mM + mL >= mN) {
        if (++mL + 1 >= mN) {
          ++mN;
          mL = 1;
        }
        mM = 1;
      }
      return Z.valueOf(mL);
    } else if (mPos == 1) {
      return Z.valueOf(mM);
    } else {
      return Z.valueOf(mN - mM - mL);
    }
  }
}
