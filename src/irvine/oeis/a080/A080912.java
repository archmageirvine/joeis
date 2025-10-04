package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A080912 a(n) = first number that appears n times in A080900.
 * @author Sean A. Irvine
 */
public class A080912 extends Sequence1 {

  private int mN = 0;
  private final Sequence mA = new A080900();
  private final LongDynamicIntArray mCounts = new LongDynamicIntArray();

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final Z t = mA.next();
      if (mCounts.increment(t.longValueExact()) == mN) {
        return t;
      }
    }
  }
}

