package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007385.
 * @author Sean A. Irvine
 */
public class A007385 extends A007380 {

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
