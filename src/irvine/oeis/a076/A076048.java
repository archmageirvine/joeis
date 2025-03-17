package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a025.A025475;

/**
 * A076048 Number of prime powers p^k (k != 1) &lt;= 10^n.
 * @author Sean A. Irvine
 */
public class A076048 extends Sequence0 {

  private final Sequence mSeq = new A025475();
  private Z mPP = mSeq.next();
  private long mCount = 0;
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    while (mPP.compareTo(mA) <= 0) {
      ++mCount;
      mPP = mSeq.next();
    }
    return Z.valueOf(mCount);
  }
}
