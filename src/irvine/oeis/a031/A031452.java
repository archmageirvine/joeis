package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A031452 In base 3 has the same number of <code>0</code>'s as <code>2</code>'s.
 * @author Sean A. Irvine
 */
public class A031452 implements Sequence {

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
