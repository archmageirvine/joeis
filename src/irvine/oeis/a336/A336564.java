package irvine.oeis.a336;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a033.A033879;

/**
 * A336564 a(n) = n - A308135(n), where A308135(n) is the sum of non-coreful divisors of n.
 * @author Georg Fischer
 */
public class A336564 extends AbstractSequence {

  private A336563 mSeq1 = new A336563();
  private A033879 mSeq2 = new A033879();

  /** Construct the sequence. */
  public A336564() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
