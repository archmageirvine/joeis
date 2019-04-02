package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007393 Number of strict 5th-order maximal independent sets in cycle graph.
 * @author Sean A. Irvine
 */
public class A007393 extends A007388 {

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
