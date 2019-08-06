package irvine.oeis.a163;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A163127 <code>a(1)=1. a(n)</code> is the number of integers k, <code>1 &lt;= k &lt;= n-1</code>, where <code>gcd(a(k), n-k) &gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A163127 implements Sequence {

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
      final long v = mSeq.get(k);
      if (v == 0) {
        if (j > 1) {
          ++c;
        }
      } else if (LongUtils.gcd(v, j) >= 2) {
        ++c;
      }
    }
    mSeq.set(n, c);
    return Z.valueOf(c);
  }
}

