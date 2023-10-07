package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001358;

/**
 * A066265 a(n) = number of semiprimes &lt; 10^n.
 * @author Sean A. Irvine
 */
public class A066265 extends Sequence1 {

  private final Sequence mSemiprimes = new A001358();
  private Z mA = mSemiprimes.next();
  private Z mT = null;
  private long mCnt = 0;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply(10);
    while (mA.compareTo(mT) < 0) {
      ++mCnt;
      mA = mSemiprimes.next();
    }
    return Z.valueOf(mCnt);
  }
}
