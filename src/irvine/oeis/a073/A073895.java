package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A073895 a(1)=1. a(n)=a(n-1)+k(n). If a(n-1) is nonprime, k(n) is the smallest composite not in the set {k(i),i&lt;n}. If a(n-1) is prime, k(n) is the smallest prime not in the set {k(i),i&lt;n}.
 * @author Sean A. Irvine
 */
public class A073895 extends Sequence1 {

  private final A000040 mPrimes = new A000040();
  private final A002808 mComposites = new A002808();
  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    mA = mA.add(mA.isProbablePrime() ? mPrimes.next() : mComposites.next());
    return mA;
  }
}

