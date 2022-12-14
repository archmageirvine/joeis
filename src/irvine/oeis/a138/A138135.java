package irvine.oeis.a138;
// manually anopsn 0, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a096.A096541;

/**
 * A138135 Number of parts &gt; 1 in the last section of the set of partitions of n.
 * @author Georg Fischer
 */
public class A138135 extends AbstractSequence {

  private A096541 mSeq1 = new A096541();
  private Z mA;
  private int mN = 0;

  /** Construct the sequence. */
  public A138135() {
    super(1);
    mSeq1.next();
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 1) {
      return Z.ZERO;
    }
    final Z b = mSeq1.next();
    final Z result = b.subtract(mA);
    mA = b;
    return result;
  }
}
