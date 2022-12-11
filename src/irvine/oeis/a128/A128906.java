package irvine.oeis.a128;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001918;
import irvine.oeis.a071.A071894;

/**
 * A128906 Difference between the greatest primitive root and the least primitive root of the n-th prime.
 * @author Georg Fischer
 */
public class A128906 extends AbstractSequence {

  private A071894 mSeq1 = new A071894();
  private A001918 mSeq2 = new A001918();

  /** Construct the sequence. */
  public A128906() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
