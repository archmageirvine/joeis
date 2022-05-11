package irvine.oeis.a002;

import java.util.ArrayList;

import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002905 Number of connected graphs with n edges.
 * @author Sean A. Irvine
 */
public class A002905 implements Sequence {

  private final ArrayList<Z> mEdgeCounts = new ArrayList<>();
  protected int mN = 0;

  @Override
  public Z next() {
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(1);
    gg.setVertices(++mN);
    gg.setMaxEdges((mN * mN - mN) / 2);
    gg.sanitizeParams();
    gg.run(false, false, false, 0, 0);
    final long[] cnt = gg.edgeCounts();
    //System.out.println(mN + " " + Arrays.toString(cnt));
    for (int k = 0; k < cnt.length; ++k) {
      if (k >= mEdgeCounts.size()) {
        mEdgeCounts.add(Z.valueOf(cnt[k]));
      } else {
        mEdgeCounts.set(k, mEdgeCounts.get(k).add(cnt[k]));
      }
    }
    return mEdgeCounts.get(mN - 1);
  }
}
