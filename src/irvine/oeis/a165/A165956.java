package irvine.oeis.a165;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A165956 <code>a(0) = 1</code>. For <code>n &gt;=1, a(n) =</code> the number of earlier terms that, when written in binary, are substrings in binary <code>n</code>.
 * @author Sean A. Irvine
 */
public class A165956 implements Sequence {

  private final LongDynamicLongArray mSeq = new LongDynamicLongArray();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mSeq.set(0, 1L);
      return Z.ONE;
    }
    long c = 0;
    final String s = Long.toBinaryString(mN);
    for (long k = 0; k < mSeq.length(); ++k) {
      if (s.contains(Long.toBinaryString(mSeq.get(k)))) {
        ++c;
      }
    }
    mSeq.set(mSeq.length(), c);
    return Z.valueOf(c);
  }
}

