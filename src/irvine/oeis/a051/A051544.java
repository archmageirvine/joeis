package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A051544 Quotients of consecutive values of lcm {1, 4, 7, 10, 13 ...,(3n+1)} (A016777).
 * @author Sean A. Irvine
 */
public class A051544 extends AbstractSequence {

  private final A051536 mSeq1 = new A051536();

  /** Construct the sequence. */
  public A051544() {
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
