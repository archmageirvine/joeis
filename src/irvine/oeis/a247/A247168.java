package irvine.oeis.a247;
// manually anopsn 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001672;

/**
 * A247168 Number of times n occurs in the sequence floor(log_Pi(i)) with i=1,2,3,... .
 * @author Georg Fischer
 */
public class A247168 extends AbstractSequence {

  private final A001672 mSeq1 = new A001672();
  private Z mA;

  /** Construct the sequence. */
  public A247168() {
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
