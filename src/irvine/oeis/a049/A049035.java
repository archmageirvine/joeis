package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001359;
import irvine.oeis.a006.A006988;

/**
 * A049035 Number of pairs of twin primes whose smaller element is &lt;= 10^n-th prime.
 * @author Sean A. Irvine
 */
public class A049035 extends A006988 {

  private final Sequence mTwinLower = new A001359();
  private Z mP = mTwinLower.next();
  private long mCnt = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    final Z lim = super.next();
    while (mP.compareTo(lim) <= 0) {
      ++mCnt;
      mP = mTwinLower.next();
    }
    return Z.valueOf(mCnt);
  }
}
