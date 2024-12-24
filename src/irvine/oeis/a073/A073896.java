package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A073896 a(1) = 1, a(n) = a(n-1) + k where k is smallest prime or composite number not used earlier according as a(n-1) is nonprime or prime.
 * @author Sean A. Irvine
 */
public class A073896 extends Sequence1 {

  private final A000040 mPrimes = new A000040();
  private final A002808 mComposites = new A002808();
  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    mA = mA.add(mA.isProbablePrime() ? mComposites.next() : mPrimes.next());
    return mA;
  }
}

