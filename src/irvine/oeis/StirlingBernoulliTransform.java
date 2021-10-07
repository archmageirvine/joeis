package irvine.oeis;

import irvine.math.z.Stirling;
import irvine.math.z.Z;

/**
 * Apply the Stirling-Bernoulli transform to another sequence.
 * @author Sean A. Irvine
 */
public class StirlingBernoulliTransform implements Sequence {

  private int mN = -1;
  private final MemorySequence mSeq;

  protected StirlingBernoulliTransform(final Sequence seq) {
    mSeq = MemorySequence.cachedSequence(seq);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z fk = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      if (k > 1) {
        fk = fk.multiply(k);
      }
      sum = sum.signedAdd((k & 1) == 0, fk.multiply(Stirling.secondKind(mN + 1, k + 1)).multiply(mSeq.a(k)));
    }
    return sum;
  }
}
