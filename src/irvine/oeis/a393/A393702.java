package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a394.A394611;
import irvine.util.array.LongDynamicIntArray;

/**
 * A397205.
 * @author Sean A. Irvine
 */
public class A393702 extends Sequence1 {

  private final Sequence mW = new A394611();
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
