package irvine.oeis.a209;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000720;
import irvine.oeis.a013.A013928;

/**
 * A209628 Number of squarefree numbers &lt; n that are not prime.
 * @author Georg Fischer
 */
public class A209628 extends AbstractSequence {

  private A013928 mSeq1 = new A013928();
  private A000720 mSeq2 = new A000720();

  /** Construct the sequence. */
  public A209628() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
