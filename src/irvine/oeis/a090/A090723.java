package irvine.oeis.a090;
// manually anopsn 0, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000700;

/**
 * A090723 a(1) = 1; for n &gt; 1, number of partitions of n into distinct odd parts such that the two largest parts differ by 2.
 * @author Georg Fischer
 */
public class A090723 extends AbstractSequence {

  private A000700 mSeq1 = new A000700();
  private Z mA;
  private Z mB;
  private int mN = 0;

  /** Construct the sequence. */
  public A090723() {
    super(1);
    mA = Z.ZERO;
    mB = mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    final Z c = mSeq1.next();
    final Z result = (mN == 2) ? Z.ZERO : c.subtract(mA);
    mA = mB;
    mB = c;
    return result;
  }
}
