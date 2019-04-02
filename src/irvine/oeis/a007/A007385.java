package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007385 Number of strict 5th-order maximal independent sets in path graph.
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
