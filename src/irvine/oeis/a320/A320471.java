package irvine.oeis.a320;
// manually anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000196;
import irvine.oeis.a037.A037213;

/**
 * A320471 a(n) = floor(sqrt(n)) mod ceiling(sqrt(n)).
 * @author Georg Fischer
 */
public class A320471 extends AbstractSequence {

  private A000196 mSeq1 = new A000196();
  private A037213 mSeq2 = new A037213();

  /** Construct the sequence. */
  public A320471() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
