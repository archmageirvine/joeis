package irvine.oeis.a138;
// manually anopsn 0,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006190;

/**
 * A138365 a(n) = A006190(n) * A006190(n+2).
 * @author Georg Fischer
 */
public class A138365 extends AbstractSequence {

  private final A006190 mSeq1 = new A006190();
  private Z mA;
  private Z mB;

  /** Construct the sequence. */
  public A138365() {
    super(1);
    mSeq1.next();
    mA = mSeq1.next();
    mB = mSeq1.next();
  }

  @Override
  public Z next() {
    final Z c = mSeq1.next();
    final Z result = c.multiply(mA);
    mA = mB;
    mB = c;
    return result;
  }
}
