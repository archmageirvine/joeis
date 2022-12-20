package irvine.oeis.a106;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a004.A004736;
import irvine.oeis.transform.BinomialTransformSequence;

/**
 * A106496 Binomial transform of a fractal structured sequence.
 * @author Georg Fischer
 */
public class A106496 extends AbstractSequence {

  private final BinomialTransformSequence mSeq1 = new BinomialTransformSequence(new A004736(), 0);

  /** Construct the sequence. */
  public A106496() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
