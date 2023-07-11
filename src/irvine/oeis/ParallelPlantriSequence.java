package irvine.oeis;

import irvine.math.plantri.Plantri;
import irvine.math.plantri.PlantriGraphProcessor;
import irvine.math.plantri.PlantriGraphState;
import irvine.math.z.Z;

/**
 * A sequence generated using Plantri (potentially) running in parallel.
 * Uses the <code>res/mod</code> feature of Plantri to execute Plantri
 * in parallel.
 * @author Sean A. Irvine
 */
public abstract class ParallelPlantriSequence extends AbstractSequence {

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));

  protected int mN;
  private final int mFirstNonZero;

  /**
   * Construct a new parallel execution of Plantri.
   * @param offset first index of target sequence
   * @param start one less than the first term (number of vertices)
   * @param firstNonZero first nonzero term
   */
  protected ParallelPlantriSequence(final int offset, final int start, final int firstNonZero) {
    super(offset);
    mN = start;
    mFirstNonZero = firstNonZero;
  }

  /**
   * Construct a new parallel execution of Plantri.
   * @param start one less than the first term (number of vertices)
   * @param firstNonZero first nonzero term
   */
  protected ParallelPlantriSequence(final int start, final int firstNonZero) {
    this(start + 1, start, firstNonZero);
  }

  /**
   * Test if the current Plantri graph state should be included in the count.
   * This implementation must be thread safe.
   * @param plantri Plantri engine
   * @param state Plantri state
   * @return true iff this state should be counted
   */
  protected abstract boolean accept(final Plantri plantri, final PlantriGraphState state);

  /**
   * Actual Plantri execution (per thread).
   * @param plantri plantri object
   * @return count from this run
   */
  protected long runPlantri(final Plantri plantri) {
    return plantri.count(mN, -1, -1, -1, false, false, false, false);
  }

  private final class MyThread extends Thread implements PlantriGraphProcessor {

    private final int mResidue;
    private long mCount = 0;

    private MyThread(final int residue) {
      mResidue = residue;
    }

    @Override
    public boolean accept(final Plantri plantri, final PlantriGraphState state) {
      return ParallelPlantriSequence.this.accept(plantri, state);
    }

    @Override
    public void run() {
      final Plantri plantri = new Plantri();
      plantri.setResMod(mResidue, THREADS);
      plantri.setGraphProcessor(this);
      mCount = runPlantri(plantri);
    }
  }

  @Override
  public Z next() {
    if (++mN < mFirstNonZero) {
      return Z.ZERO;
    }
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

