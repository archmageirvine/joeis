package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072499 Product of divisors of n which are &lt;= n^(1/2).
 * @author Sean A. Irvine
 */
public class A072499 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
      if (d.square().compareTo(mN) > 0) {
        break;
      }
      prod = prod.multiply(d);
    }
    return prod;
  }
}

