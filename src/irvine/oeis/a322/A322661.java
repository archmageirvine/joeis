package irvine.oeis.a322;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006125;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A322661 Number of graphs with loops spanning n labeled vertices.
 * @author Georg Fischer
 */
public class A322661 extends AbstractSequence {

  private final InverseBinomialTransformSequence mSeq1 = new InverseBinomialTransformSequence(new A006125(), 1);

  /** Construct the sequence. */
  public A322661() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
