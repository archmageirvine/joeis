package irvine.oeis.a066;
// manually anopsn 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006094;

/**
 * A066116 a(n) = prime(n-2)*prime(n-1)^2*prime(n).
 * @author Georg Fischer
 */
public class A066116 extends AbstractSequence {

  private A006094 mSeq1 = new A006094();
  private Z mA;

  /** Construct the sequence. */
  public A066116() {
    super(3);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    final Z b = mSeq1.next();
    final Z result = b.multiply(mA);
    mA = b;
    return result;
  }
}
