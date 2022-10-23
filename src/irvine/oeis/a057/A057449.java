package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057449 Product of differences between consecutive positive divisors of n.
 * @author Sean A. Irvine
 */
public class A057449 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    Z t = null;
    for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
      if (t != null) {
        prod = prod.multiply(d.subtract(t));
      }
      t = d;
    }
    return prod;
  }
}
