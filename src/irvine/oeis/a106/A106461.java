package irvine.oeis.a106;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001511;
import irvine.oeis.transform.BinomialTransformSequence;

/**
 * A106461 Binomial transform of the Tower of Hanoi sequence.
 * @author Georg Fischer
 */
public class A106461 extends AbstractSequence {

  private final BinomialTransformSequence mSeq1 = new BinomialTransformSequence(new A001511(), 0);

  /** Construct the sequence. */
  public A106461() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
