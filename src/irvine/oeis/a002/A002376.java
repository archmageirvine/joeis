package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A002376.
 * @author Sean A. Irvine
 */
public class A002376 implements Sequence {

  private final LongDynamicByteArray mMinRep = new LongDynamicByteArray();
  private long mN = 0;
  private long mM = 0;
  private long mC = 0;

  @Override
  public Z next() {
    if (++mN > mC) {
      ++mM;
      mC = mM * mM * mM;
      mMinRep.set(mC, (byte) 1);
      final long limit = mMinRep.length();
      for (long m = 1; m <= mM; ++m) {
        final long c = m * m * m;
        for (long k = 1; k < limit; ++k) {
          final byte current = mMinRep.get(k);
          if (current != 0) {
            long sum = k;
            for (int i = current + 1; i <= 9; ++i) {
              sum += c;
              final byte target = mMinRep.get(sum);
              if (target == 0 || target > i) {
                mMinRep.set(sum, (byte) i);
              }
            }
          }
        }
      }
    }
    return Z.valueOf(mMinRep.get(mN));
  }
}
