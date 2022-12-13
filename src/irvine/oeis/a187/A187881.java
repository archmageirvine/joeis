package irvine.oeis.a187;
// manually anopan 0,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002260;
import irvine.oeis.a101.A101688;

/**
 * A187881 Triangle read by rows: the n-th column consists of n n&apos;s followed by 0&apos;s.
 * @author Georg Fischer
 */
public class A187881 extends AbstractSequence {

  private A101688 mSeq1 = new A101688();
  private A002260 mSeq2 = new A002260();

  /** Construct the sequence. */
  public A187881() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
