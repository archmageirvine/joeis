package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a001.A001608;

/**
 * A007391.
 * @author Sean A. Irvine
 */
public class A007391 extends A001608 {

  {
    super.next();
  }

  private long mN = -2;
  private boolean mAlternate = false;

  @Override
  public Z next() {
    mAlternate = !mAlternate;
    if (mAlternate) {
      mN += mN == 0 ? 3 : 2;
    }
    return super.next().subtract(mAlternate ? mN : 2);
  }
}
