package irvine.oeis.a162;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A162683 a(0)=1. a(n) = the number of terms among (a(0),a(1),...a(n-1)) that either are coprime to n or divide n.
 * @author Sean A. Irvine
 */
public class A162683 extends Sequence0 {

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

