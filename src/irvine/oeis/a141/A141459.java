package irvine.oeis.a141;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A141459 a(n) = Product_{p-1 divides n} p, where p is an odd prime.
 * @author Georg Fischer
 */
public class A141459 extends AbstractSequence {

  private final BernoulliSequence mBSeq = new BernoulliSequence(0);
  private int mN = -1;

  /** Construct the sequence. */
  public A141459() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return mBSeq.nextQ().multiply(Z.FOUR.pow(mN)).den();
  }
}
