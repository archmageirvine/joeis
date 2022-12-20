package irvine.oeis.a095;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a053.A053529;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A095051 E.g.f.: exp(-x)/eta(x), where eta(x) is the Dedekind eta function.
 * @author Georg Fischer
 */
public class A095051 extends AbstractSequence {

  private final InverseBinomialTransformSequence mSeq1 = new InverseBinomialTransformSequence(new A053529(), 0);

  /** Construct the sequence. */
  public A095051() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
