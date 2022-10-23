package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050214 Product((d+n/d): d divides n and d^2&lt;=n); a(1)=1.
 * @author Sean A. Irvine
 */
public class A050214 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z prod = Z.ONE;
    if (!Z.ONE.equals(mN)) {
      for (final Z d : Jaguar.factor(mN).divisors()) {
        if (d.square().compareTo(mN) <= 0) {
          prod = prod.multiply(d.add(mN.divide(d)));
        }
      }
    }
    return prod;
  }
}
