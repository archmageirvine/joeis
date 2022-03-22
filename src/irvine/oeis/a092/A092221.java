package irvine.oeis.a092;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A092221 Numbers k such that numerator of Bernoulli(2*k) is divisible by 59, the second irregular prime.
 * @author Georg Fischer
 */
public class A092221 implements Sequence {

  protected final BernoulliSequence mBern;
  private int mN;
  protected long mDiv;

  /** Construct the sequence. */
  public A092221() {
    this(59);
  }

  /**
   * Generic constructor with parameters
   * @param base
   */
  public A092221(final int div) {
    mDiv = div;
    mBern = new BernoulliSequence(1);
    mN = 0;
  }

  /**
   * Test the condition.
   * @param n current index
   * @return true if the condition is met, or false otherwise.
   */
  protected boolean isOk(final long n) {
    mBern.nextQ();
    return mBern.nextQ().num().mod(mDiv) == 0;
  }

  @Override
  public Z next() {
    while (!isOk(++mN)) {
    }
    return Z.valueOf(mN);
  }
}
