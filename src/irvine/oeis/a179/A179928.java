package irvine.oeis.a179;
// manually anopsn 0, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a026.A026898;

/**
 * A179928 Row sums of A179927, the triangle of centered orthotopic numbers.
 * @author Georg Fischer
 */
public class A179928 extends AbstractSequence {

  private int mN = -1;
  private A026898 mSeq1 = new A026898();
  private Z mA;

  /** Construct the sequence. */
  public A179928() {
    super(0);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z b = mSeq1.next();
    final Z result = b.add(mA);
    mA = b;
    return result;
  }
}
