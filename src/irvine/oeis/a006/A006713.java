package irvine.oeis.a006;

import irvine.graph.CubicGenerator;
import irvine.graph.EdgeColouring;
import irvine.graph.Graph;
import irvine.graph.VertexLabeling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.Collection;

/**
 * A006713 Number of 3-edge-colored connected trivalent graphs with 2n labeled nodes.
 * @author Sean A. Irvine
 */
public class A006713 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final CubicGenerator mCubicGraphs = new CubicGenerator(this instanceof A006712);
  {
    mCubicGraphs.next(); // skip 2 vertex case
  }

  @Override
  public Z next() {
    Z cnt = Z.ZERO;
    final Collection<Graph<Integer, String>> graphs = mCubicGraphs.next();
    for (final Graph<Integer, String> g : graphs) {
      if (g.isSimple()) {
        final EdgeColouring col = new EdgeColouring(g, 3);
        col.run();
        final long colourings = col.getCount();
        if (colourings != 0) {
          final long labelings = VertexLabeling.countLabellings(g);
          final Z contrib = Z.valueOf(labelings).multiply(colourings);
          if (mVerbose) {
            System.out.println(contrib + " (" + colourings + " * " + labelings + ") graph " + g);
          }
          cnt = cnt.add(contrib);
        }
      }
    }
    return cnt;
  }
}
