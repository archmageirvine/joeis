package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006753;
import irvine.util.array.LongDynamicArray;

/**
 * A033663 Least Smith number having digital sum <code>A033662(n)</code>.
 * @author Sean A. Irvine
 */
public class A033663 extends A033662 {

  private final LongDynamicArray<Z> mSeen = new LongDynamicArray<>();
  private final Sequence mSmith = new A006753();

  @Override
  public Z next() {
    final long t = super.next().longValueExact();
    while (mSeen.get(t) == null) {
      final Z smith = mSmith.next();
      final long d = ZUtils.digitSum(smith);
      if (mSeen.get(d) == null) {
        mSeen.set(d, smith);
      }
    }
    return mSeen.get(t);
  }
}
