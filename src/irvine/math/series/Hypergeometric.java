package irvine.math.series;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.util.array.LongDynamicArray;

/**
 * Series corresponding to a hypergeometric series.
 * @author Sean A. Irvine
 */
public class Hypergeometric extends AbstractInfiniteSeries<Q> {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Q[] mUpper;
  private final Q[] mLower;
  private final Q[] mUpperRunning;
  private final Q[] mLowerRunning;
  private final LongDynamicArray<Q> mSeries = new LongDynamicArray<>();
  private long mK = -1;

  /**
   * Compute a hypergeometric series.
   * @param upper upper parameters
   * @param lower lower parameters
   */
  public Hypergeometric(final Q[] upper, final Q[] lower) {
    mUpper = upper;
    mLower = lower;
    mUpperRunning = new Q[mUpper.length];
    Arrays.fill(mUpperRunning, Q.ONE);
    mLowerRunning = new Q[mLower.length];
    Arrays.fill(mLowerRunning, Q.ONE);
  }

  @Override
  public Q coeff(final long n) {
    while (n > mK) {
      if (++mK > 0) {
        for (int j = 0; j < mUpper.length; ++j) {
          mUpperRunning[j] = mUpperRunning[j].multiply(mUpper[j].add(mK - 1));
        }
        for (int j = 0; j < mLower.length; ++j) {
          mLowerRunning[j] = mLowerRunning[j].multiply(mLower[j].add(mK - 1));
        }
      }
      Q coeff = Q.ONE;
      for (final Q u : mUpperRunning) {
        coeff = coeff.multiply(u);
      }
      for (final Q l : mLowerRunning) {
        coeff = coeff.divide(l);
      }
      mSeries.set(mK, coeff.divide(Functions.FACTORIAL.z(mK)));
    }
    return mSeries.get(n);
  }

  /**
   * Construct a hypergeometric series.
   * @param upper upper parameters
   * @param lower lower parameters
   * @param z underlying series
   * @return series
   */
  public static Series<Q> s(final Q[] upper, final Q[] lower, final Series<Q> z) {
    return SQ.substitute(new Hypergeometric(upper, lower), z);
  }
}
