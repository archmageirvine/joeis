package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a038.A038498;

/**
 * A039801 Column 2 of Inverse partition triangle A038498.
 * @author Sean A. Irvine
 */
public class A039801 extends AbstractSequence {

  private final A038498 mSeq1 = new A038498();

  /** Construct the sequence. */
  public A039801() {
    super(2);
  }

  private long mN = 0;

  {
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
