package irvine.oeis.a306;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002110;

/**
 * A306237 a(n) = primorial prime(n)#/prime(n - 1).
 * @author Georg Fischer
 */
public class A306237 extends AbstractSequence {

  private final A002110 mSeq1 = new A002110();
  private final A000040 mSeq2 = new A000040();

  /** Construct the sequence. */
  public A306237() {
    super(2);
    mSeq1.next();
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(mSeq2.next());
  }
}
