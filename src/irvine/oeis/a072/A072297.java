package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a063.A063740;

/**
 * A072297 Number of even non-cototients not exceeding 2^n.
 * @author Sean A. Irvine
 */
public class A072297 extends Sequence1 {

  private final Sequence mCototientCounts = new A063740();
  private long mN = 1;
  private long mM = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    mN <<= 1;
    while (mM < mN) {
      mM += 2;
      if (mCototientCounts.next().isZero()) {
        ++mCount;
      }
      mCototientCounts.next(); // odd term
    }
    return Z.valueOf(mCount);
  }
}

