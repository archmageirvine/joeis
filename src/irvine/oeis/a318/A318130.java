package irvine.oeis.a318;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a119.A119563;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A318130 Number of sets of subsets of {1,...,n} with intersection {}.
 * @author Georg Fischer
 */
public class A318130 extends AbstractSequence {

  private final InverseBinomialTransformSequence mSeq1 = new InverseBinomialTransformSequence(new A119563(), 0);

  /** Construct the sequence. */
  public A318130() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
