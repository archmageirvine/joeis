package irvine.oeis.a163;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A163126 a(1)=1. a(n) = the number of integers k, 1 &lt;= k &lt;= n-1, where a(k) is coprime to n-k.
 * @author Sean A. Irvine
 */
public class A163126 extends Sequence1 {

  private final LongDynamicLongArray mSeq = new LongDynamicLongArray();

  @Override
  public Z next() {
    if (mSeq.length() == 0) {
      mSeq.set(1, 1L);
      return Z.ONE;
    }
    final long n = mSeq.length();
    long c = 0;
    for (long k = 1, j = n - 1; k < n; ++k, --j) {
      if (Functions.GCD.l(mSeq.get(k), j) == 1) {
        ++c;
      }
    }
    mSeq.set(n, c);
    return Z.valueOf(c);
  }
}

