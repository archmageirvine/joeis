package irvine.oeis.a249;
// manually anopsn 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a048.A048967;

/**
 * A249304 Number of zeros in row n of triangle A249133.
 * @author Georg Fischer
 */
public class A249304 extends AbstractSequence {

  private final A048967 mSeq1 = new A048967();
  private Z mA;

  /** Construct the sequence. */
  public A249304() {
    super(0);
    mA = Z.ZERO;
  }

  @Override
  public Z next() {
    final Z b = mSeq1.next();
    final Z result = b.add(mA);
    mA = b;
    return result;
  }
}
