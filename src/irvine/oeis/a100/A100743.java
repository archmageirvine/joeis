package irvine.oeis.a100;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a059.A059167;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A100743 Number of labeled n-vertex graphs without vertices of degree &lt;=1.
 * @author Georg Fischer
 */
public class A100743 extends AbstractSequence {

  private final InverseBinomialTransformSequence mSeq1 = new InverseBinomialTransformSequence(new A059167(), 0);

  /** Construct the sequence. */
  public A100743() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
