package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A083485 Diagonal of A083486.
 * @author Sean A. Irvine
 */
public class A083485 extends AbstractSequence {

  private int mN = -1;

  private final A083486 mSeq = new A083486();

  /** Construct the sequence. */
  public A083485() {
    super(2);
  }

  @Override
  public Z next() {
    ++mN;
    for (int k = 0; k < mN; ++k) {
      mSeq.next();
    }
    return mSeq.next();
  }
}
