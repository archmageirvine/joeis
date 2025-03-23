package irvine.oeis.a002;

import java.util.ArrayList;

import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002905 Number of connected graphs with n edges.
 * @author Sean A. Irvine
 */
public class A002905 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002905(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002905() {
    super(0);
  }

  private final ArrayList<Z> mEdgeCounts = new ArrayList<>();
  protected int mN = 0;

  @Override
  public Z next() {
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(1);
    gg.setVertices(++mN);
    gg.setMaxEdges((mN * mN - mN) / 2);
    gg.sanitizeParams();
    gg.run(0, 0, 0);
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
