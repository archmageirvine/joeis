package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007386 Number of strict 7th-order maximal independent sets in path graph.
 * @author Sean A. Irvine
 */
public class A007386 extends A007381 {

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
