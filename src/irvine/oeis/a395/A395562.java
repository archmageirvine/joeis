package irvine.oeis.a395;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A395562 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A395562 extends A001597 {

  @Override
  public Z next() {
    final Z pp = super.next();
    if (pp.isOne()) {
      return Z.ONE;
    }
    final Z r = pp.isPower();
    final Z e = Z.valueOf(pp.auxiliary());
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(e).divisors()) {
      if (!d.equals(e)) {
        sum = sum.add(r.pow(d));
      }
    }
    return sum;
  }
}
