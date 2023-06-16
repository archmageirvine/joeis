package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A028914 Divide A028913 by 2.
 * @author Sean A. Irvine
 */
public class A028914 extends AbstractSequence {

  private final A028913 mSeq = new A028913();

  /** Construct the sequence. */
  public A028914() {
    super(1);
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().divide2();
  }
}
