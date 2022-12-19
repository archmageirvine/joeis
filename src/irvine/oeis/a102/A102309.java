package irvine.oeis.a102;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A102309 a(n) = Sum_{d divides n} moebius(d) * C(n/d,2).
 * @author Georg Fischer
 */
public class A102309 extends AbstractSequence {

  private final MobiusTransformSequence mSeq1 = new MobiusTransformSequence(new A000217(), 0);

  /** Construct the sequence. */
  public A102309() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
