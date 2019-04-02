package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007394 Number of strict 7th-order maximal independent sets in cycle graph.
 * @author Sean A. Irvine
 */
public class A007394 extends A007389 {

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
