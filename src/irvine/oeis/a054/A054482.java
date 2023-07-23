package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002182;

/**
 * A054482 Denominator of lowest terms fraction from division of a highly composite number (1) by its predecessor.
 * @author Sean A. Irvine
 */
public class A054482 extends AbstractSequence {

  private final A002182 mSeq1 = new A002182();

  /** Construct the sequence. */
  public A054482() {
    super(2);
  }

  private Z mA = mSeq1.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mSeq1.next();
    return t.divide(mA.gcd(t));
  }
}
