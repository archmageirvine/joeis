package irvine.oeis.a106;
// manually anopsn 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a054.A054685;

/**
 * A106244 Number of partitions into distinct prime powers.
 * @author Georg Fischer
 */
public class A106244 extends AbstractSequence {

  private A054685 mSeq1 = new A054685();
  private Z mA;
  private int mN = -1;

  /** Construct the sequence. */
  public A106244() {
    super(0);
    mSeq1.next();
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 1) {
      return Z.ONE;
    }
    final Z b = mSeq1.next();
    final Z result = b.add(mA);
    mA = b;
    return result;
  }
}
