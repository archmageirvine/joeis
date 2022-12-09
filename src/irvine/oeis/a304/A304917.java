package irvine.oeis.a304;
// manually anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002110;
import irvine.oeis.a062.A062457;

/**
 * A304917 a(n) = prime(n)^n - primorial(n - 1).
 * @author Georg Fischer
 */
public class A304917 extends AbstractSequence {

  private A062457 mSeq1 = new A062457();
  private A002110 mSeq2 = new A002110();

  /** Construct the sequence. */
  public A304917() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
