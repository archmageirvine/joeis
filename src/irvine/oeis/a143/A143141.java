package irvine.oeis.a143;
// manually anopsn 0, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a055.A055887;

/**
 * A143141 Total number of all repeated partitions of the integer n and its parts down to parts equal to 1. Essentially first differences of A055887.
 * @author Georg Fischer
 */
public class A143141 extends AbstractSequence {

  private A055887 mSeq1 = new A055887();
  private Z mA;
  private int mN = 0;

  /** Construct the sequence. */
  public A143141() {
    super(1);
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
    final Z result = b.subtract(mA);
    mA = b;
    return result;
  }
}
