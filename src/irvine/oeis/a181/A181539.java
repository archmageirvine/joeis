package irvine.oeis.a181;

import irvine.math.z.Z;
import irvine.oeis.a224.A224474;

/**
 * A181539 Smallest number m &gt; 1 such that m^2 == 1 (mod 10^n).
 * @author Sean A. Irvine
 */
public class A181539 extends A224474 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z b = super.next();
    if (++mN == 1) {
      return Z.NINE;
    }
    if (mN == 2) {
      return Z.valueOf(49);
    }
    final Z u = Z.TEN.pow(mN - 1);
    final Z t = u.multiply(5);
    return b.min(b.subtract(t).abs()).min(u.multiply(10).subtract(b));
  }
}
