package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a092.A092113;

/**
 * A067607 Number of stacks of n pancakes requiring a maximum number of flips to order.
 * @author Sean A. Irvine
 */
public class A067607 extends A092113 {

  @Override
  public Z next() {
    step();
    return Z.valueOf(mCounts.get(mCounts.length() - 1));
  }
}

