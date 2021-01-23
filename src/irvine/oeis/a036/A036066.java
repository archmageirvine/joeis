package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A036066 The summarize Lucas sequence: summarize the previous two terms, start with 1, 3.
 * @author Sean A. Irvine
 */
public class A036066 implements Sequence {

  private final Z mA0;
  private final Z mB0;
  private Z mA = null;
  private Z mB = null;

  protected A036066(final long a, final long b) {
    mA0 = Z.valueOf(a);
    mB0 = Z.valueOf(b);
  }

  /** Construct the sequence. */
  public A036066() {
    this(1, 3);
  }

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = mA0;
        return mA0;
      }
      mB = mB0;
      return mB0;
    }
    final int[] ca = ZUtils.digitCounts(mA);
    final int[] cb = ZUtils.digitCounts(mB);
    final StringBuilder sb = new StringBuilder();
    for (int d = 9; d >= 0; --d) {
      final int t = ca[d] + cb[d];
      if (t > 0) {
        sb.append(t).append(d);
      }
    }
    mA = mB;
    mB = new Z(sb);
    return mB;
  }
}
