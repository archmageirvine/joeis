package irvine.oeis.a355;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a194.A194689;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A355253 Expansion of e.g.f. exp(2*(exp(x) - 1) - 3*x).
 * @author Georg Fischer
 */
public class A355253 extends AbstractSequence {

  private final InverseBinomialTransformSequence mSeq1 = new InverseBinomialTransformSequence(new A194689(), 0);

  /** Construct the sequence. */
  public A355253() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
