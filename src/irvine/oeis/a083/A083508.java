package irvine.oeis.a083;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083508 Number of distinct products i*j*k with 1 &lt;= i &lt; j &lt;= k &lt;= n and j &lt; n.
 * @author Sean A. Irvine
 */
public class A083508 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> s = new HashSet<>();
    for (long k = 2; k <= mN; ++k) {
      for (long j = 2; j <= k; ++j) {
        if (j != mN) {
          for (long i = 1; i < j; ++i) {
            s.add(k * j * i);
          }
        }
      }
    }
    return Z.valueOf(s.size());
  }
}
