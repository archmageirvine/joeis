package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a031.A031157;

/**
 * A055728 Number of prime lucky numbers &lt;10^n.
 * @author Sean A. Irvine
 */
public class A055728 extends AbstractSequence {

  private final A031157 mSeq1 = new A031157();

  /** Construct the sequence. */
  public A055728() {
    super(0);
  }

  private long mLimit = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    mLimit = mLimit == 0 ? 1 : mLimit * 10;
    while (mSeq1.next().longValueExact() < mLimit) {
      ++mCount;
    }
    return Z.valueOf(mCount++);
  }
}
