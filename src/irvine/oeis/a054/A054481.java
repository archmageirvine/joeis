package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002182;

/**
 * A054481 Highest common factor of successive highly composite numbers (1), A002182.
 * @author Sean A. Irvine
 */
public class A054481 extends AbstractSequence {

  private final A002182 mSeq1 = new A002182();

  /** Construct the sequence. */
  public A054481() {
    super(2);
  }

  private Z mA = mSeq1.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mSeq1.next();
    return mA.gcd(t);
  }
}
