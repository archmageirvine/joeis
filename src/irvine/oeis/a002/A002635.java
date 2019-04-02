package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicIntArray;

/**
 * A002635 Number of partitions of n into 4 squares.
 * @author Sean A. Irvine
 */
public class A002635 implements Sequence {

  private final LongDynamicIntArray mSeq = new LongDynamicIntArray();
  {
    mSeq.set(0, 1);
  }
  private long mN = -1;
  private long mA = 0;

  @Override
  public Z next() {
    if (++mN >= mA * mA) {
      ++mA;
      final long aa = mA * mA;
      for (long b = 0; b <= mA; ++b) {
        final long bbaa = aa + b * b;
        for (long c = 0; c <= b; ++c) {
          final long ccbbaa = bbaa + c * c;
          for (long d = 0; d <= c; ++d) {
            final long n = ccbbaa + d * d;
            mSeq.set(n, mSeq.get(n) + 1);
          }
        }
      }
    }
    return Z.valueOf(mSeq.get(mN));
  }
}
