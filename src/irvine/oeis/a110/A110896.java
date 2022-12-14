package irvine.oeis.a110;
// manually anopsn 0, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006988;

/**
 * A110896 Difference between prime(10^n) and prime(10^(n-1)).
 * @author Georg Fischer
 */
public class A110896 extends AbstractSequence {

  private A006988 mSeq1 = new A006988();
  private Z mA;

  /** Construct the sequence. */
  public A110896() {
    super(1);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    final Z b = mSeq1.next();
    final Z result = b.subtract(mA);
    mA = b;
    return result;
  }
}
