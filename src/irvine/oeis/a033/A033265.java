package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033265 Number of i such that d(i) &gt;= d(i-1), where Sum_{i=0..m} d(i)*2^i is the base-2 representation of n.
 * @author Sean A. Irvine
 */
public class A033265 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long prev = ++mN & 1;
    long c = 0;
    for (long m = mN >>> 1; m != 0; m >>>= 1) {
      final long t = m & 1;
      if (t >= prev) {
        ++c;
      }
      prev = t;
    }
    return Z.valueOf(c);
  }
}

