package irvine.oeis.a073;
// manually 2021-10-19

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A073219 The terms of A073211 (sums of two powers of 11) divided by 2.
 * @author Georg Fischer
 */
public class A073219 extends AbstractSequence {

  private final A073211 mSeq1 = new A073211();

  /** Construct the sequence. */
  public A073219() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().divide2();
  }
}
