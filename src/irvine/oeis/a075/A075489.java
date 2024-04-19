package irvine.oeis.a075;
// manually anopsn 0,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a062.A062439;

/**
 * A075489 a(n) = prime((n+1)!) - prime(n!).
 * @author Georg Fischer
 */
public class A075489 extends AbstractSequence {

  private final A062439 mSeq1 = new A062439();
  private Z mA;

  /** Construct the sequence. */
  public A075489() {
    super(1);
    mA = mSeq1.next();
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
