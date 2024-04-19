package irvine.oeis.a298;
// manually anopsn 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000001;

/**
 * A298739 First differences of A000001 (the number of groups of order n).
 * @author Georg Fischer
 */
public class A298739 extends AbstractSequence {

  private final A000001 mSeq1 = new A000001();
  private Z mA;

  /** Construct the sequence. */
  public A298739() {
    super(1);
    mSeq1.next();
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
