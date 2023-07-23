package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a038.A038498;

/**
 * A039802 Column 3 of Inverse partition triangle A038498.
 * @author Sean A. Irvine
 */
public class A039802 extends AbstractSequence {

  private final A038498 mSeq1 = new A038498();

  /** Construct the sequence. */
  public A039802() {
    super(3);
  }

  private long mN = 1;

  {
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
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
