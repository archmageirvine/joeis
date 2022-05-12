package irvine.oeis.a038;

import java.util.TreeSet;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038193 Let G be an n-node graph with valencies d_1 .. d_n say; let m = (d_1 + ... + d_n)/n and s = n*Sum( (d_i-m)^2 ) be the scaled degree variance; a(n) gives number of different values taken by s.
 * @author Sean A. Irvine
 */
public class A038193 implements Sequence, GraphProcessor {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private final TreeSet<Long> mSeen = new TreeSet<>();

  @Override
  public void process(final Graph graph) {
    final long m = 2L * graph.size();
    final int n = graph.order();
    long s = 0;
    for (int k = 0; k < n; ++k) {
      final long t = n * graph.degree(k) - m;
      s += t * t;
    }
    mSeen.add(s);
  }

  @Override
  public Z next() {
    ++mN;
    mSeen.clear();
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(1);
    gg.setVertices(mN);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setMinDeg(0);
    gg.setMaxDeg(mN);
    gg.setProcessor(this);
    gg.sanitizeParams();
    gg.run(false, false, false, 0, 0);
    if (mVerbose) {
      System.out.println(mSeen);
    }
    return Z.valueOf(mSeen.size());
  }
}
