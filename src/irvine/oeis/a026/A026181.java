package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A026181 a(n) = (1/2)*(s(n) - s(n-1)), where s = A026180.
 * @author Sean A. Irvine
 */
public class A026181 extends AbstractSequence {

  private final A026180 mSeq1 = new A026180();

  /** Construct the sequence. */
  public A026181() {
    super(3);
  }

  {
    mSeq1.next();
  }

  private Z mA = mSeq1.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mSeq1.next();
    return mA.subtract(t).divide2();
  }
}
