package irvine.oeis.a174;
// manually anopsn 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000058;

/**
 * A174864 a(1) = 1, a(n) = square of the sum of previous terms.
 * @author Georg Fischer
 */
public class A174864 extends AbstractSequence {

  private final A000058 mSeq1 = new A000058();
  private Z mA;
  private int mN = 0;

  /** Construct the sequence. */
  public A174864() {
    super(1);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 1) {
      return Z.ONE;
    }
    final Z b = mSeq1.next();
    final Z result = b.subtract(mA);
    mA = b;
    return result;
  }
}
