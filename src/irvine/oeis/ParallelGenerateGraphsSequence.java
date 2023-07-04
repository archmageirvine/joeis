package irvine.oeis;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;

/**
 * A sequence generated using nauty (potentially) running in parallel.
 * Uses the <code>res/mod</code> feature of nauty to execute nauty
 * in parallel.
 * @author Sean A. Irvine
 */
public abstract class ParallelGenerateGraphsSequence extends AbstractSequence {

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));

  protected int mN;
  private final int mFirstNonZero;
  private final boolean mBipartite;
  private final boolean mSquareFree;
  private final boolean mTriangleFree;

  /**
   * Construct a new parallel execution of nauty.
   * @param start one less than the first term (number of vertices)
   * @param firstNonZero first nonzero term
   * @param bipartite generate bipartite graphs
   * @param squareFree generate square free graphs
   * @param triangleFree generate triangle free graphs
   */
  protected ParallelGenerateGraphsSequence(final int start, final int firstNonZero, final boolean bipartite, final boolean squareFree, final boolean triangleFree) {
    super(start + 1);
    mN = start;
    mFirstNonZero = firstNonZero;
    mBipartite = bipartite;
    mSquareFree = squareFree;
    mTriangleFree = triangleFree;
  }

  /**
   * Test if the current graph should be included in the count and return the
   * count for the graph.  That is, if the graph contributes nothing then 0 is returned.
   * @param graph current graph
   * @return the count for this graph (can be 0)
   */
  protected abstract long getCount(final Graph graph);

  /**
   * Set up the required parameters for graphs to be generated.
   * @param gg partially initialized generator
   */
  protected abstract void graphGenInit(final GenerateGraphs gg);

  private final class MyThread extends Thread implements GraphProcessor {

    private final int mResidue;
    private long mCount = 0;

    private MyThread(final int residue) {
      mResidue = residue;
    }

    @Override
    public void process(final Graph graph) {
      mCount += ParallelGenerateGraphsSequence.this.getCount(graph);
    }

    @Override
    public void run() {
      final GenerateGraphs gg = new GenerateGraphs(THREADS);
      gg.setProcessor(this);
      ParallelGenerateGraphsSequence.this.graphGenInit(gg);
      gg.sanitizeParams();
      gg.run(mBipartite, mSquareFree, mTriangleFree, 0, mResidue);
    }
  }

  protected void init(final int n) {
  }

  @Override
  public Z next() {
    if (++mN < mFirstNonZero) {
      return Z.ZERO;
    }
    init(mN);
    final MyThread[] jobs = new MyThread[THREADS];
    for (int k = 0; k < jobs.length; ++k) {
      jobs[k] = new MyThread(k);
      jobs[k].start();
    }
    Z sum = Z.ZERO;
    for (final MyThread job : jobs) {
      try {
        job.join();
        sum = sum.add(job.mCount);
      } catch (final InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    return sum;
  }
}

