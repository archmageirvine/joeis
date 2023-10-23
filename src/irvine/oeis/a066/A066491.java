package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A066491 Twin prime gaps: Pairs n, n+1 such that f(n) = f(n+1), where f is the prime gaps function given by f(m) = prime(m+1)-prime(m) and prime(m) denotes the m-th prime.
 * @author Sean A. Irvine
 */
public class A066491 extends A001223 {

  private long mN = 0;
  private Z mA = super.next();
  private Z mT = null;

  @Override
  public Z next() {
    if (mT != null) {
      final Z r = mT;
      mT = null;
      return r;
    }
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (t.equals(mA)) {
        mT = Z.valueOf(mN + 1);
        return Z.valueOf(mN);
      }
    }
  }
}
