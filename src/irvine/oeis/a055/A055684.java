package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a023.A023022;

/**
 * A055684 Number of different n-pointed stars.
 * @author Sean A. Irvine
 */
public class A055684 extends AbstractSequence {

  private final A023022 mSeq1 = new A023022();

  /** Construct the sequence. */
  public A055684() {
    super(3);
  }

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(1);
  }
}
