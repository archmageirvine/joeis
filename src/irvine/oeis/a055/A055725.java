package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000959;
import irvine.oeis.a031.A031158;
import irvine.oeis.a031.A031159;

/**
 * A055725 Number of isolated lucky twins &lt;= 10^n.
 * @author Sean A. Irvine
 */
public class A055725 implements Sequence {

  private long mLimit = 0;
  private long mCount = 0;
  private final Sequence mIsolatedLuckyTwins = new SetDifferenceSequence(new SetDifferenceSequence(new A000959(), new A031158()), new A031159());
  private Z mA = mIsolatedLuckyTwins.next();

  @Override
  public Z next() {
    mLimit = mLimit == 0 ? 1 : mLimit * 10;
    while (mA.longValueExact() <= mLimit) {
      ++mCount;
      mA = mIsolatedLuckyTwins.next();
    }
    return Z.valueOf(mCount);
  }
}
