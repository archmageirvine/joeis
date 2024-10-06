package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072500 Product of divisors of n which are &gt;= n^(1/2).
 * @author Sean A. Irvine
 */
public class A072500 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.square().compareTo(mN) >= 0) {
        prod = prod.multiply(d);
      }
    }
    return prod;
  }
}

