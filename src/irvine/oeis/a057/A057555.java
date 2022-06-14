package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057555 Lexicographic ordering of N x N, where N = {1,2,3...}.
 * @author Sean A. Irvine
 */
public class A057555 implements Sequence {

  private long mN = 1;
  private long mM = 0;
  private boolean mLeft = false;

  @Override
  public Z next() {
    mLeft = !mLeft;
    if (mLeft) {
      if (++mM >= mN) {
        ++mN;
        mM = 1;
      }
      return Z.valueOf(mM);
    } else {
      return Z.valueOf(mN - mM);
    }
  }
}
