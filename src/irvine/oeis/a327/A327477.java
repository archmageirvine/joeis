package irvine.oeis.a327;
// manually anopsn 0,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A327477 Number of subsets of {1..n} containing n whose mean is not an element.
 * @author Georg Fischer
 */
public class A327477 extends AbstractSequence {

  private int mN = -1;
  private A327471 mSeq1 = new A327471();
  private Z mA;

  /** Construct the sequence. */
  public A327477() {
    super(0);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Z b = mSeq1.next();
    final Z result = b.subtract(mA);
    mA = b;
    return result;
  }
}
