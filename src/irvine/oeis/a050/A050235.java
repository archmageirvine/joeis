package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a007.A007629;

/**
 * A050235 a(n) is the number of n-digit Keith numbers A007629.
 * @author Sean A. Irvine
 */
public class A050235 extends A007629 {

  private Z mT = Z.TEN;
  private Z mA = super.next();

  @Override
  public Z next() {
    long cnt = 0;
    while (mA.compareTo(mT) < 0) {
      ++cnt;
      mA = super.next();
    }
    mT = mT.multiply(10);
    return Z.valueOf(cnt);
  }
}
