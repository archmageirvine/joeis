package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A051541 Quotients of consecutive values of LCM {1, 5, 9, 13, 17, ..., (4n+1)}.
 * @author Sean A. Irvine
 */
public class A051541 extends AbstractSequence {

  private final A051539 mSeq1 = new A051539();

  /** Construct the sequence. */
  public A051541() {
    super(1);
  }

  private Z mA = mSeq1.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mSeq1.next();
    return mA.divide(t);
  }
}
