package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A046885 Row sums of triangle A046658.
 * @author Sean A. Irvine
 */
public class A046885 extends AbstractSequence {

  private final A046714 mSeq1 = new A046714();

  /** Construct the sequence. */
  public A046885() {
    super(1);
  }

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.multiply(5);
    return mA.subtract(mSeq1.next());
  }
}
