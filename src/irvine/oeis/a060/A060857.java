package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A060857 Describe all the numbers already used (sorted into increasing order - not splitting numbers up into their digits).
 * @author Sean A. Irvine
 */
public class A060857 extends Sequence0 {

  private LongDynamicLongArray mCounts = new LongDynamicLongArray();

  @Override
  public Z next() {
    if (mCounts.length() == 0) {
      mCounts.set(1, 1);
      return Z.ONE;
    } else {
      final StringBuilder sb = new StringBuilder();
      final LongDynamicLongArray newCounts = new LongDynamicLongArray();
      for (long k = 1; k < mCounts.length(); ++k) {
        final long c = mCounts.get(k);
        if (c != 0) {
          sb.append(c).append(k);
          newCounts.increment(c);
          newCounts.add(k, 1 + c);
        }
      }
      mCounts = newCounts;
      return new Z(sb);
    }
  }
}
