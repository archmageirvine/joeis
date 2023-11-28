package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A002637 Number of partitions of n into not more than 5 pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A002637 extends Sequence1 {

  private final LongDynamicIntArray mSeq = new LongDynamicIntArray();
  private long mN = 0;
  private long mA = 0;

  private long p(final long n) {
    return (3 * n * n - n) / 2;
  }

  @Override
  public Z next() {
    if (++mN >= p(mA)) {
      ++mA;
      final long aa = p(mA);
      for (long b = 0; b <= mA; ++b) {
        final long bbaa = aa + p(b);
        for (long c = 0; c <= b; ++c) {
          final long ccbbaa = bbaa + p(c);
          for (long d = 0; d <= c; ++d) {
            final long ddccbbaa = ccbbaa + p(d);
            for (long e = 0; e <= d; ++e) {
              mSeq.increment(ddccbbaa + p(e));
            }
          }
        }
      }
    }
    return Z.valueOf(mSeq.get(mN));
  }
}
