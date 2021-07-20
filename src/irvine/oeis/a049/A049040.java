package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005384;
import irvine.oeis.a006.A006988;

/**
 * A049040 Number of Sophie Germain primes &lt;= prime(10^n).
 * @author Sean A. Irvine
 */
public class A049040 extends A006988 {

  private final Sequence mSophieGermain = new A005384();
  private Z mP = mSophieGermain.next();
  private long mCnt = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    final Z lim = super.next();
    while (mP.compareTo(lim) <= 0) {
      ++mCnt;
      mP = mSophieGermain.next();
    }
    return Z.valueOf(mCnt);
  }
}
