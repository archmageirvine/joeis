package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A014727 Squares of even elements in Pascal's triangle A007318.
 * @author Sean A. Irvine
 */
public class A014727 extends AbstractSequence {

  private final A014428 mSeq1 = new A014428();

  /** Construct the sequence. */
  public A014727() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().square();
  }
}
