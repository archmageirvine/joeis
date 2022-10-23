package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008860 a(n) = Sum_{k=0..7} binomial(n,k).
 * @author Sean A. Irvine
 */
public class A008860 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.subtract(14).multiply(mN)
      .add(112).multiply(mN)
      .subtract(350).multiply(mN)
      .add(1099).multiply(mN)
      .add(364).multiply(mN)
      .add(3828).multiply(mN)
      .add(5040).divide(5040);
  }
}
