package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A034981 Smallest square starting with a string of n 2's.
 * @author Sean A. Irvine
 */
public class A034981 extends AbstractSequence {

  private final A034980 mSeq1 = new A034980();

  /** Construct the sequence. */
  public A034981() {
    super(1);
  }

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().square();
  }
}
