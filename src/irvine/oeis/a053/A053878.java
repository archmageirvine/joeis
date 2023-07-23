package irvine.oeis.a053;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002182;

/**
 * A053878 Difference between numerator and denominator of lowest terms fraction from division of a highly composite number (1) by its predecessor.
 * @author Sean A. Irvine
 */
public class A053878 extends AbstractSequence {

  private final A002182 mSeq1 = new A002182();

  /** Construct the sequence. */
  public A053878() {
    super(2);
  }

  private Z mA = mSeq1.next();

  @Override
  public Z next() {
    final Z b = mA;
    mA = mSeq1.next();
    final Q t = new Q(mA, b);
    return t.num().subtract(t.den());
  }
}
