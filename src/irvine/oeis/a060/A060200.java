package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005384;
import irvine.oeis.a033.A033844;

/**
 * A060200 Number of Sophie Germain primes &lt;= prime(2^n).
 * @author Sean A. Irvine
 */
public class A060200 extends A033844 {

  private final Sequence mSophieGermain = new A005384();
  private Z mP = mSophieGermain.next();
  private long mCnt = 0;

  {
    setOffset(1);
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
