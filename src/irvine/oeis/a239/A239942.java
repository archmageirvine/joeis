package irvine.oeis.a239;
// manually anopsn 1, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a039.A039716;

/**
 * A239942 a(n) = prime(n)! - prime(n - 1)!.
 * @author Georg Fischer
 */
public class A239942 extends AbstractSequence {

  private A039716 mSeq1 = new A039716();
  private Z mA;

  /** Construct the sequence. */
  public A239942() {
    super(2);
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
