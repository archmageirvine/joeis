package irvine.oeis.a323;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a016.A016031;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A323816 Number of set-systems covering n vertices with no singletons.
 * @author Georg Fischer
 */
public class A323816 extends AbstractSequence {

  private final InverseBinomialTransformSequence mSeq1 = new InverseBinomialTransformSequence(new A016031(), 0);

  /** Construct the sequence. */
  public A323816() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
