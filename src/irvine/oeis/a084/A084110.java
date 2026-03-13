package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084110 Let L(n) = ordered list of divisors of n = {d_1=1, d_2, ..., d_k=n}; set e_1=1, e_i = e_{i-1}/d_i if that is an integer otherwise e_i = e_{i-1}*d_i; then a(n) = e_k.
 * @author Sean A. Irvine
 */
public class A084110 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
      if (prod.mod(d).isZero()) {
        prod = prod.divide(d);
      } else {
        prod = prod.multiply(d);
      }
    }
    return prod;
  }
}
