package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a038.A038498;

/**
 * A039803 Column 4 of inverse partition triangle A038498.
 * @author Sean A. Irvine
 */
public class A039803 extends AbstractSequence {

  private final A038498 mSeq1 = new A038498();

  /** Construct the sequence. */
  public A039803() {
    super(4);
  }

  private long mN = 2;

  {
    for (int k = 0; k < 7; ++k) {
      mSeq1.next();
    }
  }

  @Override
  public Z next() {
    for (long k = 0; k < mN; ++k) {
      mSeq1.next();
    }
    ++mN;
    return mSeq1.next();
  }
}
