package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a001.A001687;

/**
 * A007384.
 * @author Sean A. Irvine
 */
public class A007384 extends A001687 {

  {
    for (int k = 0; k < 7; ++k) {
      next();
    }
  }

  private long mN = 1;
  private boolean mAlternate = true;

  @Override
  public Z next() {
    if (mAlternate) {
      ++mN;
    }
    mAlternate = !mAlternate;
    return super.next().subtract(mAlternate ? mN : 1);
  }
}
