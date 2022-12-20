package irvine.oeis.a125;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000182;
import irvine.oeis.transform.BinomialTransformSequence;

/**
 * A125054 Central terms of triangle A125053.
 * @author Georg Fischer
 */
public class A125054 extends AbstractSequence {

  private final BinomialTransformSequence mSeq1 = new BinomialTransformSequence(new A000182(), 0);

  /** Construct the sequence. */
  public A125054() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
