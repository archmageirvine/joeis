package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002858;
import irvine.util.array.LongDynamicIntArray;

/**
 * A080573 Number of ways writing n as a sum of two distinct Ulam numbers.
 * @author Sean A. Irvine
 */
public class A080573 extends Sequence1 {

  private final LongDynamicIntArray mCounts = new LongDynamicIntArray();
  private final Sequence mUlam = new A002858();
  private long mU = mUlam.next().longValueExact();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mU <= mN) {
      final Sequence otherUlam = new A002858();
      while (true) {
        final long t = otherUlam.next().longValue();
        if (t == mU) {
          mU = mUlam.next().longValueExact();
          break;
        }
        mCounts.increment(t + mU);
      }
    }
    return Z.valueOf(mCounts.get(mN));
  }
}

