package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007956 Product of the proper divisors of n.
 * @author Sean A. Irvine
 */
public class A007956 extends Sequence1 {

  protected Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z prod = Z.ONE;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (!d.equals(mN)) {
        prod = prod.multiply(d);
      }
    }
    return prod;
  }
}
