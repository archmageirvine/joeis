package irvine.oeis.a161;
// manually anopsn 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A161768 a(n) = A161767(n) - A161767(n-1) = number of divisors of A161767(n+1).
 * @author Georg Fischer
 */
public class A161768 extends AbstractSequence {

  private A161767 mSeq1 = new A161767();
  private Z mA;

  /** Construct the sequence. */
  public A161768() {
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
