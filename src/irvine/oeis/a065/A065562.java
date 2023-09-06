package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002260;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A065562 a(n) = b(n)-th highest positive integer not equal to any a(k), 1 &lt;= k &lt; n, where {b(n)} = 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, ... (sequence A002260).
 * @author Sean A. Irvine
 */
public class A065562 extends Sequence1 {

  private final Sequence mA = new A002260();
  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mMin = 1;

  @Override
  public Z next() {
    while (mSeen.isSet(mMin)) {
      ++mMin;
    }
    long s = mA.next().longValueExact();
    long k = mMin - 1;
    while (s > 0) {
      do {
        ++k;
      } while (mSeen.isSet(k));
      --s;
    }
    mSeen.set(k);
    return Z.valueOf(k);
  }
}
