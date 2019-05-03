package irvine.oeis.a007;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007812 Number of n-node Steinhaus graphs whose complements have at least one <code>cut-vertex</code>.
 * @author Sean A. Irvine
 */
public class A007812 implements Sequence {

  // The initial terms of this sequence are not what I would expect.
  private static final int[] SMALL = {0, 0, 1, 3, 2, 6};

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return Z.valueOf(SMALL[mN]);
    }
    long count = 0;
    for (long u = 0; u < 1L << (mN - 1); ++u) {
      final Graph g = GraphFactory.steinhaus(mN, u);
      final Graph c = g.complement();
      //System.out.println(g + " -> " + c);
      final int comp = c.numberOfComponents();
      for (int q = 0; q < mN; ++q) {
        if (c.delete(q).numberOfComponents() > comp) {
          ++count;
          break;
        }
      }
    }
    return Z.valueOf(count);
  }
}
