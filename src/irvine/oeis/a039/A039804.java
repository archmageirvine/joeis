package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a038.A038498;

/**
 * A039804 Column 5 of Inverse partition triangle A038498.
 * @author Sean A. Irvine
 */
public class A039804 extends AbstractSequence {

  private final A038498 mSeq1 = new A038498();

  /** Construct the sequence. */
  public A039804() {
    super(5);
  }

  private long mN = 3;

  {
    for (int k = 0; k < 11; ++k) {
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
