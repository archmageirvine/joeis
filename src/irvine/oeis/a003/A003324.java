package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicByteArray;

/**
 * A003324 A nonrepetitive sequence.
 * @author Sean A. Irvine
 */
public class A003324 extends Sequence1 {

  private long mN = -1;
  private final LongDynamicByteArray mSeq = new LongDynamicByteArray();
  {
    mSeq.set(0, (byte) 1);
    mSeq.set(1, (byte) 2);
    mSeq.set(2, (byte) 3);
    mSeq.set(3, (byte) 4);
  }

  @Override
  public Z next() {
    if (++mN == mSeq.length()) {
      final long l = mN / 4;
      long q = mN;
      for (long k = 0; k < l; ++k, ++q) {
        mSeq.set(q, mSeq.get(k));
      }
      final long l3 = 3 * l;
      for (long k = 0; k < l; ++k, ++q) {
        mSeq.set(q, mSeq.get(k + l3));
      }
      final long l2 = 2 * l;
      for (long k = 0; k < l; ++k, ++q) {
        mSeq.set(q, mSeq.get(k + l2));
      }
      for (long k = 0; k < l; ++k, ++q) {
        mSeq.set(q, mSeq.get(k + l));
      }
    }
    return Z.valueOf(mSeq.get(mN));
  }
}
