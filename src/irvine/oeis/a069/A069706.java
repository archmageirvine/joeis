package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A069706 Primes with property that swapping first and last digits also gives a prime.
 * @author Sean A. Irvine
 */
public class A069706 extends A000040 {

  private Z mMod = Z.TEN;
  private Z mLim = Z.valueOf(100);

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.compareTo(Z.TEN) < 0) {
        return p;
      }
      if (p.compareTo(mLim) >= 0) {
        mMod = mLim;
        mLim = mLim.multiply(10);
      }
      final Z[] qr = p.divideAndRemainder(mMod);
      if (qr[0].isOdd()) {
        final Z t = mMod.multiply(p.mod(10)).add(qr[1].divide(10).multiply(10).add(qr[0]));
        if (t.isProbablePrime()) {
          return p;
        }
      }
    }
  }
}
