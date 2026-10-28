package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a399.A399995;
import irvine.util.array.LongDynamicIntArray;

/**
 * A393702 First number to occur at least n times in Weinstein's W sequence (A399995).
 * @author Sean A. Irvine
 */
public class A393702 extends Sequence1 {

  private final Sequence mW = new A399995();
  private final LongDynamicIntArray mCounts = new LongDynamicIntArray();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final Z v = mW.next();
      if (mCounts.increment(v.longValueExact()) == mN) {
        return v;
      }
    }
  }
}
