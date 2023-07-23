package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A051552 Quotients of consecutive values of LCM {b(0), b(1) ...,b(n)}, b() = A016789.
 * @author Sean A. Irvine
 */
public class A051552 extends AbstractSequence {

  private final A051540 mSeq1 = new A051540();

  /** Construct the sequence. */
  public A051552() {
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
