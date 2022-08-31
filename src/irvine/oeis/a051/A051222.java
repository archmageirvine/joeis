package irvine.oeis.a051;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A051222 Numbers k such that Bernoulli number B_{k} has denominator 6.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A051222 implements SequenceWithOffset {

  private long mN;
  private int mOffset;
  private Z mDenom;
  private final BernoulliSequence mB = new BernoulliSequence(2);

  /** Construct the sequence. */
  public A051222() {
    this(1, 6);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param denom denominator of Bernoulli number
   */
  public A051222(final int offset, final int denom) {
    mN = 1;
    mOffset = offset;
    mDenom = Z.valueOf(denom);
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Q b = mB.nextQ();
      if (b.den().equals(mDenom)) {
        return Z.valueOf(mN);
      }
    }
  }
}
