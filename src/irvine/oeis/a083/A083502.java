package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083502 Smallest k such that n*(n+k) + 1 is an n-th power.
 * @author Sean A. Irvine
 */
public class A083502 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long k = 1;
    while (true) {
      final Z t = Z.valueOf(++k).pow(mN).subtract(1);
      final Z[] qr = t.divideAndRemainder(mN);
      if (qr[1].isZero()) {
        return qr[0].subtract(mN);
      }
    }
  }
}
