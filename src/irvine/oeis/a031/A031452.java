package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A031452 Numbers whose base-3 representation has the same number of 0's as 2's.
 * @author Sean A. Irvine
 */
public class A031452 extends Sequence1 {

  private final int mBase;
  private final int mA;
  private final int mB;
  private final int mDelta;
  private Z mN = Z.ZERO;

  protected A031452(final int base, final int a, final int b, final int delta) {
    mBase = base;
    mA = a;
    mB = b;
    mDelta = delta;
  }

  /** Construct the sequence. */
  public A031452() {
    this(3, 0, 2, 0);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int[] cnts = ZUtils.digitCounts(mN, mBase);
      if (cnts[mA] == cnts[mB] + mDelta) {
        return mN;
      }
    }
  }
}
