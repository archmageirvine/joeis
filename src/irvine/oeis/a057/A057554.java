package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057554 Lexicographic ordering of MxM, where M={0,1,2,...}.
 * @author Sean A. Irvine
 */
public class A057554 implements Sequence {

  private long mN = -1;
  private long mM = 0;
  private boolean mLeft = false;

  @Override
  public Z next() {
    mLeft = !mLeft;
    if (mLeft) {
      if (++mM > mN) {
        ++mN;
        mM = 0;
      }
      return Z.valueOf(mM);
    } else {
      return Z.valueOf(mN - mM);
    }
  }
}
