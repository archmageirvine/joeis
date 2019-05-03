package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a001.A001055;

/**
 * A080444 Write <code>n A001055(n)</code> times.
 * @author Sean A. Irvine
 */
public class A080444 extends A001055 {

  private long mCount = super.next().longValue();
  private long mPrinted = 0;

  @Override
  public Z next() {
    if (mPrinted == mCount) {
      mCount = super.next().longValue();
      mPrinted = 0;
    }
    ++mPrinted;
    return Z.valueOf(mN);
  }
}
