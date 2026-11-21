package irvine.oeis.a339;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.transform.EulerTransform;

/**
 * A339152 Number of essentially parallel nonequivalent series-parallel networks with n elements and without unit elements in parallel.
 * @author Gregory Morse
 */
public class A339152 extends Sequence1 {
  // After Andrew Howroyd.
  private final boolean mSeries;
  private final ArrayList<Z> mSeriesCounts = new ArrayList<>();
  private final ArrayList<Z> mParallelCounts = new ArrayList<>();

  protected A339152(final boolean series) {
    mSeries = series;
  }

  /** Construct the sequence. */
  public A339152() {
    this(false);
  }

  private static Z euler(final ArrayList<Z> counts) {
    return new EulerTransform(1, new FiniteSequence(counts)).skip(counts.size()).next();
  }

  @Override
  public Z next() {
    final Z parallel = mParallelCounts.isEmpty() ? Z.ONE : euler(mSeriesCounts);
    final Z series = euler(mParallelCounts);
    mParallelCounts.add(parallel);
    mSeriesCounts.add(series);
    return mSeries ? series : parallel;
  }
}
