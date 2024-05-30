package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048274 Let G be the graph with n vertices, the i-th vertex consisting of all multiples of i &lt;= n, where edges indicate that the vertices intersect; a(n) = |n-(number of edges of G)|.
 * @author Sean A. Irvine
 */
public class A048274 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      for (long j = k + 1; j <= mN; ++j) {
        if (Functions.LCM.l(k, j) <= mN) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(mN - cnt).abs();
  }
}

