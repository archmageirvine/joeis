package irvine.oeis.a355;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a027.A027710;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A355254 Expansion of e.g.f. exp(3*(exp(x) - 1) - x).
 * @author Georg Fischer
 */
public class A355254 extends AbstractSequence {

  private final InverseBinomialTransformSequence mSeq1 = new InverseBinomialTransformSequence(new A027710(), 0);

  /** Construct the sequence. */
  public A355254() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
