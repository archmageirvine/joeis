package irvine.oeis.a003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import irvine.math.graph.Graph;
import irvine.math.graph.Graph6;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003216 Number of Hamiltonian graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A003216 implements Sequence, GraphProcessor {

  private int mN = 0;
  private long mCount = 0;

  @Override
  public void process(final Graph graph) {
    if (graph.isHamiltonian()) {
      //System.out.println(graph);
      ++mCount;
    }
  }

  @Override
  public Z next() {
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(++mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setConnectionLevel(1);
    gg.setMinDeg(2);
    gg.setMaxDeg(mN);
    gg.setProcessor(this);
    gg.sanitizeParams();
    mCount = 0;
    try {
      gg.run(false, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    return Z.valueOf(mCount);
  }

  /**
   * This main is used as part of a parallel computation of Hamiltonian graphs generated by nauty.
   * For example, <code>geng -d2 -c 7 | java irvine.oeis.a003.A003216</code>.
   * @param args ignored
   * @throws java.io.IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    long c = 0;
    long n = 0;
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      while ((line = r.readLine()) != null) {
        ++n;
        final Graph g = Graph6.toGraph(line);
        if (g.isHamiltonian()) {
          ++c;
        }
      }
    }
    System.out.println(c + " " + n);
  }
}
