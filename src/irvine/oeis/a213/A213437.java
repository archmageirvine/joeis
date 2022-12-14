package irvine.oeis.a213;
// manually anopsn 0, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001699;

/**
 * A213437 Nonlinear recurrence: a(n) = a(n-1) + (a(n-1)+1)*Product_{j=1..n-2} a(j).
 * @author Georg Fischer
 */
public class A213437 extends AbstractSequence {

  private A001699 mSeq1 = new A001699();
  private Z mA;
  private int mN = 0;

  /** Construct the sequence. */
  public A213437() {
    super(1);
    mSeq1.next();
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 1) {
      return Z.ONE;
    }
    final Z b = mSeq1.next();
    final Z result = b.divide(mA);
    mA = b;
    return result;
  }
}
