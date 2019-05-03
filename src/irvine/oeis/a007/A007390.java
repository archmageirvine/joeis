package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000204;

/**
 * A007390 Number of strict <code>(-1)st-order</code> maximal independent sets in cycle graph.
 * @author Sean A. Irvine
 */
public class A007390 extends A000204 {

  private long mN = -1;
  private boolean mAlternate = false;

  @Override
  public Z next() {
    mAlternate = !mAlternate;
    if (mAlternate) {
      mN += mN == 1 ? 3 : 2;
    }
    return super.next().subtract(mAlternate ? mN : 3);
  }
}
