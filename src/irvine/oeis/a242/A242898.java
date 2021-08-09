package irvine.oeis.a242;
// manually 2021-08-08

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A242898 Cumulative number of letters in decimal expansion of Pi being spoken in English as "Three Point One Four One...".
 * @author Georg Fischer
 */
public class A242898 extends A000796 {

  protected int mN = 0;
  protected Z mSum = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      mSum = mSum.add(Z.valueOf("three".length()));
      super.next(); // skip 3.
    } else if (mN == 2) {
      mSum = mSum.add(Z.valueOf("point".length()));
    } else {
      mSum = mSum.add(new int[] {4, 3, 3, 5, 4, 4, 3, 5, 5, 4}[super.next().intValue()]);
    }
    return mSum;
  }
}
