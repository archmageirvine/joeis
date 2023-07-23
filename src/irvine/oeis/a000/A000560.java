package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000560 Number of ways of folding a strip of n labeled stamps.
 * @author Sean A. Irvine
 */
public class A000560 extends AbstractSequence {

  private final A000682 mSeq1 = new A000682();

  /** Construct the sequence. */
  public A000560() {
    super(2);
  }

  {
    mSeq1.next();
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide2();
  }
}
