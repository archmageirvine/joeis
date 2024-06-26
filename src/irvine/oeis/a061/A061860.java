package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061860 Variant of A061417.
 * @author Sean A. Irvine
 */
public class A061860 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Binomial.binomial(mN, d).multiply(Functions.PHI.l(mN / d)).multiply(Functions.FACTORIAL.z(d))).divide(mN);
  }
}
