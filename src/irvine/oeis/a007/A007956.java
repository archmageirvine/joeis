package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007956 Product of proper divisors of n.
 * @author Sean A. Irvine
 */
public class A007956 implements Sequence {

  protected Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z prod = Z.ONE;
    for (final Z d : Cheetah.factor(mN).divisors()) {
      if (!d.equals(mN)) {
        prod = prod.multiply(d);
      }
    }
    return prod;
  }
}
