package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010551 Multiply successively by 1,1,2,2,3,3,4,4,..., n &gt;= 1, a(0) = 1.
 * @author Sean A. Irvine
 */
public class A010551 implements Sequence {

  private Z mA = null;
  private long mN = 1;
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.multiply(mN);
      if (!mFirst) {
        mFirst = true;
        ++mN;
      } else {
        mFirst = false;
      }
    }
    return mA;
  }
}
