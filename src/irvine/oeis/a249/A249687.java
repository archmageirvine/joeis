package irvine.oeis.a249;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000521;

/**
 * A249687 Coefficients of the j-function, squared: a(n) = A000521(n)^2.
 * @author Georg Fischer
 */
public class A249687 extends AbstractSequence {

  private final A000521 mSeq;

  /** Construct the sequence. */
  public A249687() {
    super(-1);
    mSeq = new A000521();
  }

  @Override
  public Z next() {
    return mSeq.next().square();
  }
}
