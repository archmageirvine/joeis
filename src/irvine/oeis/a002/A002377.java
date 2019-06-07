package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A002377 Least number of 4th powers needed to represent <code>n</code>.
 * @author Sean A. Irvine
 */
public class A002377 implements Sequence {

  private final LongDynamicByteArray mMinRep = new LongDynamicByteArray();
  private long mN = 0;
  private long mM = 0;
  private long mC = 0;

  @Override
  public Z next() {
    if (++mN > mC) {
      if (++mM > 55108) {
        throw new UnsupportedOperationException();
      }
      final long t = mM * mM;
      mC = t * t;
      mMinRep.set(mC, (byte) 1);
      final long limit = mMinRep.length();
      for (long m = 1; m <= mM; ++m) {
        final long u = m * m;
        final long c = u * u;
        for (long k = 1; k < limit; ++k) {
          final byte current = mMinRep.get(k);
          if (current != 0) {
            long sum = k;
            for (int i = current + 1; i <= 19; ++i) {
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
