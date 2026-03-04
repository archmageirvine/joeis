package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A083111 Diagonal of A083110.
 * @author Sean A. Irvine
 */
public class A083111 extends AbstractSequence {

  private long mN = -1;

  private final A083110 mSeq = new A083110();

  /** Construct the sequence. */
  public A083111() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      mSeq.next();
    }
    return mSeq.next();
  }
}

