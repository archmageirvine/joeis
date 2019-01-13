package irvine.oeis.a002;

import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.io.IOException;
import java.util.ArrayList;

/**
 * A002905.
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
    try {
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
    } catch (final IOException e) {
      throw new RuntimeException(e); // We are not generating output anyway
    }
    return mEdgeCounts.get(mN - 1);
  }
}

