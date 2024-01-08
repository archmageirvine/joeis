package irvine.oeis.a288;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A288873 Numerators of scaled Bernoulli numbers 4^n*B(n), with B(n) = A027641(n)/A027642(n).
 * @author Georg Fischer
 */
public class A288873 extends AbstractSequence {

  private final BernoulliSequence mBSeq = new BernoulliSequence(0);
  private int mN = -1;

  /** Construct the sequence. */
  public A288873() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return mBSeq.nextQ().multiply(Z.FOUR.pow(mN)).num();
  }
}
