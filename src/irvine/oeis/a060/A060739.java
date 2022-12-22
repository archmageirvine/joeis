package irvine.oeis.a060;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060739.
 * @author Sean A. Irvine
 */
public class A060739 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z prod = Integers.SINGLETON.product(1, mN - 1, k -> Binomial.binomial(2L * k, k).square().divide2());
    return (mN * (mN - 1) / 2 & 1) == 0 ? prod : prod.negate();
  }
}
