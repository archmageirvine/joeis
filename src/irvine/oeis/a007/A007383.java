package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000931;

/**
 * A007383 Number of strict first-order maximal independent sets in path graph.
 * @author Sean A. Irvine
 */
public class A007383 extends A000931 {

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
