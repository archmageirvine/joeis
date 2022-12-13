package irvine.oeis.a344;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a011.A011772;
import irvine.oeis.a047.A047994;

/**
 * A344874 a(n) = A047994(n) - A011772(n).
 * @author Georg Fischer
 */
public class A344874 extends AbstractSequence {

  private A047994 mSeq1 = new A047994();
  private A011772 mSeq2 = new A011772();

  /** Construct the sequence. */
  public A344874() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
