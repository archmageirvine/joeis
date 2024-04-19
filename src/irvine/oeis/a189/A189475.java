package irvine.oeis.a189;
// manually anopan 1,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.a036.A036449;

/**
 * A189475 First differences of A036449, triangular numbers by definition.
 * @author Georg Fischer
 */
public class A189475 extends AbstractSequence {

  private final DifferenceSequence mSeq1 = new DifferenceSequence(new A036449());

  /** Construct the sequence. */
  public A189475() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
