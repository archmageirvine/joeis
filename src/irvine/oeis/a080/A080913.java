package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A080913 Value of index in A080900 when a number first appears for the n-th time.
 * @author Sean A. Irvine
 */
public class A080913 extends Sequence1 {

  private int mN = 0;
  private long mM = 0;
  private final Sequence mA = new A080900();
  private final LongDynamicIntArray mCounts = new LongDynamicIntArray();

  @Override
  public Z next() {
    ++mN;
    while (true) {
      ++mM;
      final Z t = mA.next();
      if (mCounts.increment(t.longValueExact()) == mN) {
        return Z.valueOf(mM);
      }
    }
  }
}

