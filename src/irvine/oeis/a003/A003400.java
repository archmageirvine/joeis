package irvine.oeis.a003;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.nauty.Nauty;
import irvine.math.nauty.NautySet;
import irvine.math.nauty.OptionBlk;
import irvine.math.nauty.StatsBlk;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.io.IOException;

/**
 * A003400 Number of asymmetric (not necessarily connected) graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A003400 implements Sequence, GraphProcessor {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final long[] mWorkspace = new long[100];
  private final OptionBlk mOptions = new OptionBlk();
  private long mGenCount = 0;
  private long mCount = 0;
  private int mN = 0;
  // Reusable workspaces for nauty
  private int[] mLab;
  private int[] mPtn;
  private int[] mOrb;
  private NautySet mSet;

  @Override
  public void process(final Graph graph) throws IOException {
    ++mGenCount;
    final StatsBlk stats = new StatsBlk();
    new Nauty(graph, mLab, mPtn, mSet, mOrb, mOptions, stats, mWorkspace);
    if (stats.groupSize().compareTo(Z.ONE) <= 0) {
      ++mCount;
    }
  }

  @Override
  public Z next() {
    if (++mN > 30) {
      throw new UnsupportedOperationException();
    }
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setProcessor(this);
    gg.sanitizeParams();
    mGenCount = 0;
    mCount = 0;
    mLab = new int[mN];
    mPtn = new int[mN];
    mOrb = new int[mN];
    mSet = new NautySet(mN);
    try {
      gg.run(false, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e); // We are not generating output anyway
    }
    if (mVerbose) {
      System.out.println("Undirected generated count was " + mGenCount);
    }
    return Z.valueOf(mCount);
  }
}
