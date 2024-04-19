package irvine.oeis.a232;
// manually anopsn 0, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000670;

/**
 * A232472 2-Fubini numbers.
 * @author Georg Fischer
 */
public class A232472 extends AbstractSequence {

  private int mN = 1;
  private final A000670 mSeq1 = new A000670();
  private Z mA;

  /** Construct the sequence. */
  public A232472() {
    super(2);
    mSeq1.next();
    mSeq1.next();
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.TWO;
    }
    final Z b = mSeq1.next();
    final Z result = b.subtract(mA);
    mA = b;
    return result;
  }
}
