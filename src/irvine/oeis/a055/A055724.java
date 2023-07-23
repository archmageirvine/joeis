package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a031.A031158;

/**
 * A055724 Number of lucky twins &lt;= 10^n.
 * @author Sean A. Irvine
 */
public class A055724 extends AbstractSequence {

  private final A031158 mSeq1 = new A031158();

  /** Construct the sequence. */
  public A055724() {
    super(0);
  }

  private long mLimit = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    mLimit = mLimit == 0 ? 1 : mLimit * 10;
    while (mSeq1.next().longValueExact() <= mLimit) {
      ++mCount;
    }
    return Z.valueOf(mCount++);
  }
}
