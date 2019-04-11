package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicIntArray;

/**
 * A002636 Number of ways of writing n as an unordered sum of at most 3 nonzero triangular numbers.
 * @author Sean A. Irvine
 */
public class A002636 implements Sequence {

  private final LongDynamicIntArray mSeq = new LongDynamicIntArray();
  {
    mSeq.set(0, 1);
  }
  private long mN = -1;
  private long mA = 0;

  @Override
  public Z next() {
    if (++mN >= mA * (mA + 1) / 2) {
      ++mA;
      final long aa = mA * (mA + 1) / 2;
      for (long b = 0; b <= mA; ++b) {
        final long bbaa = aa + b * (b + 1) / 2;
        for (long c = 0; c <= b; ++c) {
          final long ccbbaa = bbaa + c * (c + 1) / 2;
          mSeq.set(ccbbaa, mSeq.get(ccbbaa) + 1);
        }
      }
    }
    return Z.valueOf(mSeq.get(mN));
  }
}
