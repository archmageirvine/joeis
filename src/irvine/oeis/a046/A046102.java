package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005663;
import irvine.oeis.a005.A005664;

/**
 * A046102 Denominators of convergents to the comma of Pythagoras.
 * @author Sean A. Irvine
 */
public class A046102 extends AbstractSequence {

  private final A005663 mSeq1 = new A005663();

  /** Construct the sequence. */
  public A046102() {
    super(1);
  }

  private final Sequence mD = new A005664();

  {
    next(); // skip 0th
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mD.next());
  }
}
