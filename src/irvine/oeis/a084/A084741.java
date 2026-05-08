package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A084741 Smallest prime of the form (n^k+1)/(n+1), or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A084741 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 8 || mN == 27 || mN == 32 || mN == 64 || mN == 125) {
      return Z.ZERO;
    }
    Z t = Z.ONE;
    while (true) {
      t = t.multiply(mN);
      final Z[] u = t.add(1).divideAndRemainder(mN + 1);
      if (u[1].isZero() && u[0].isProbablePrime()) {
        return u[0];
      }
    }
  }
}
