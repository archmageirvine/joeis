package irvine.oeis;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Multiply a constant rational factor to every term of another sequence.
 * The resulting terms must be integer.
 * @author Georg Fischer
 */
public class ConstantFactorSequence implements Sequence {

  private final Sequence mSeq;
  private final Q mFactor;

  /**
   * Construct the sequence.
   * @param seq the underlying sequence
   * @param factor the factor to be multiplied to every term of <code>seq</code>
   */
  public ConstantFactorSequence(final Sequence seq, final Q factor) {
    mSeq = seq;
    mFactor = factor;
  }

  /**
   * Constructor with long parameters.
   * @param seq the underlying sequence
   * @param num numerator of the factor
   * @param den denominator of the factor
   */
  public ConstantFactorSequence(final Sequence seq, final long num, final long den) {
    this(seq, new Q(num, den));
  }

  @Override
  public Z next() {
    final Q result = mFactor.multiply(mSeq.next());
    if (!result.isInteger()) {
      throw new UnsupportedOperationException("resulting term is not integer: " + result);
    } else {
      return result.num();
    }
  }
}
