package irvine.math.q;

import irvine.math.api.RationalSequence;
import irvine.math.function.Functions;

/**
 * Generate terms of the Bernoulli sequence.
 * @author Sean A. Irvine
 */
public class BernoulliSequence implements RationalSequence {

  private long mN;
  private final int mOffset;

  /**
   * Construct the Bernoulli sequence skipping specified initial terms.
   * @param skip number of terms to be skipped
   */
  public BernoulliSequence(final long skip) {
    mOffset = (int) skip;
    mN = mOffset - 1;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public final Q nextQ() {
    return Functions.BERNOULLI.q(++mN);
  }

  /**
   * Get the nth term of the Bernoulli sequence.
   * @param n term number
   * @return term value
   */
  public Q get(final long n) {
    return Functions.BERNOULLI.q(n);
  }
}
