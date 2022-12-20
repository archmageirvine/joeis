package irvine.oeis.a324;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a054.A054726;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A324169 Number of labeled graphs covering the vertex set {1,...,n} with no crossing edges.
 * @author Georg Fischer
 */
public class A324169 extends AbstractSequence {

  private final InverseBinomialTransformSequence mSeq1 = new InverseBinomialTransformSequence(new A054726(), 0);

  /** Construct the sequence. */
  public A324169() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
