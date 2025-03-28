package irvine.oeis.a076;

import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence1;

/**
 * A076263 Triangle read by rows: T(n,k) = number of nonisomorphic connected graphs with n vertices and k edges (n &gt;= 1, n-1 &lt;= k &lt;= n(n-1)/2).
 * @author Sean A. Irvine
 */
public class A076263 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (2 * ++mM > mN * (mN - 1)) {
      mM = mN;
      ++mN;
    }
    return new ParallelGenerateGraphsSequence(mN - 1, 0, 0, () -> Counter.ONE) {
      @Override
      protected void graphGenInit(final GenerateGraphs gg) {
        gg.setVertices(mN);
        gg.setMinEdges(mM);
        gg.setMaxEdges(mM);
        gg.setMinDeg(1);
        gg.setMaxDeg(mN - 1);
        gg.setConnectionLevel(1);
      }
    }.next();
  }
}
