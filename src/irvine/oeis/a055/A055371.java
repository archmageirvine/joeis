package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A055371 Column 1 of triangle A055370.
 * @author Sean A. Irvine
 */
public class A055371 extends AbstractSequence {

  private final A055370 mSeq1 = new A055370();

  /** Construct the sequence. */
  public A055371() {
    super(1);
  }

  private long mN = -2;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      mSeq1.next();
    }
    return mSeq1.next();
  }
}
