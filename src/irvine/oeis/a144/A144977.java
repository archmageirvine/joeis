package irvine.oeis.a144;
// manually anopsn 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a134.A134955;

/**
 * A144977 a(n) = A134955(n) - A134955(n-2).
 * @author Georg Fischer
 */
public class A144977 extends AbstractSequence {

  private final A134955 mSeq1 = new A134955();
  private Z mA;
  private Z mB;

  /** Construct the sequence. */
  public A144977() {
    super(1);
    mA = Z.ZERO;
    mB = mSeq1.next();
  }

  @Override
  public Z next() {
    final Z c = mSeq1.next();
    final Z result = c.subtract(mA);
    mA = mB;
    mB = c;
    return result;
  }
}
