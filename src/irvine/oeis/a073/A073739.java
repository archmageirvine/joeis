package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000040;

/**
 * A073571.
 * @author Sean A. Irvine
 */
public class A073739 extends Sequence0 {

  private final Sequence mPrimes = new A000040().skip(1);
  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ONE;
    }
    if ((mN & 1) == 0) {
      return Z.ZERO;
    }
    mA = mPrimes.next().subtract(mA);
    return mA;
  }
}
