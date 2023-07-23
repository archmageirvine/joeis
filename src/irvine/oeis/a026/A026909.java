package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A026909 (1/2)*T(2n,n), T given by A026907.
 * @author Sean A. Irvine
 */
public class A026909 extends AbstractSequence {

  private final A026908 mSeq1 = new A026908();

  /** Construct the sequence. */
  public A026909() {
    super(1);
  }

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide2();
  }
}
