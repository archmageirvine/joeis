package irvine.oeis.a162;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A162683 <code>a(0)=1</code>. <code>a(n) =</code> the number of terms among <code>(a(0),a(1),</code>...a(n-1)) that either are coprime to n or divide n.
 * @author Sean A. Irvine
 */
public class A162683 implements Sequence {

  private long mN = -1;
  private final LongDynamicLongArray mSeq = new LongDynamicLongArray();

  @Override
  public Z next() {
    if (++mN == 0) {
      mSeq.set(0, 1L);
      return Z.ONE;
    }
    long c = 0;
    for (long k = 0; k < mN; ++k) {
      final long v = mSeq.get(k);
      final long d = LongUtils.gcd(mN, v);
      if (d == 1 || d == v) {
        ++c;
      }
    }
    mSeq.set(mN, c);
    return Z.valueOf(c);
  }
}

