package irvine.oeis.a143;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a003.A003422;

/**
 * A143217 a(n) = n! * (!(n+1)) = n! * Sum_{k=0..n} k!.
 * @author Georg Fischer
 */
public class A143217 extends AbstractSequence {

  private A000142 mSeq1 = new A000142();
  private A003422 mSeq2 = new A003422();

  /** Construct the sequence. */
  public A143217() {
    super(0);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
