package irvine.oeis.a307;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006906;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A307258 Expansion of (1/(1 + x)) * Product_{k&gt;=1} 1/(1 - k*x^k/(1 + x)^k).
 * @author Georg Fischer
 */
public class A307258 extends AbstractSequence {

  private final InverseBinomialTransformSequence mSeq1 = new InverseBinomialTransformSequence(new A006906(), 0);

  /** Construct the sequence. */
  public A307258() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
