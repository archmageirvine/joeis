package irvine.oeis.a060;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060277 Number of m for which a+b+c = n; abc = m has at least two distinct solutions (a,b,c) with 1 &lt;= a &lt;= b &lt;= c.
 * @author Sean A. Irvine
 */
public class A060277 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final HashSet<Long> seen = new HashSet<>();
    final HashSet<Long> seen2 = new HashSet<>();
    ++mN;
    for (long a = 1; a < mN; ++a) {
      final long m = mN - a;
      for (long b = 1; b <= a && b < m; ++b) {
        final long c = m - b;
        if (c <= b && !seen.add(a * b * c)) {
          seen2.add(a * b * c);
        }
      }
    }
    return Z.valueOf(seen2.size());
  }
}
