package irvine.oeis.a162;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A162684 a(1)=1. a(n) = the number of terms among (a(1),a(2),...a(n-1)) that either are coprime to n or divide n.
 * @author Sean A. Irvine
 */
public class A162684 extends Sequence1 {

  private long mN = 0;
  private final LongDynamicLongArray mSeq = new LongDynamicLongArray();

  @Override
  public Z next() {
    if (++mN == 1) {
      mSeq.set(1, 1L);
      return Z.ONE;
    }
    long c = 0;
    for (long k = 1; k < mN; ++k) {
      final long v = mSeq.get(k);
      final long d = Functions.GCD.l(mN, v);
      if (d == 1 || d == v) {
        ++c;
      }
    }
    mSeq.set(mN, c);
    return Z.valueOf(c);
  }
}

