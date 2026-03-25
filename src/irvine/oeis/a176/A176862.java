package irvine.oeis.a176;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A176862 A symmetrical triangle sequence:t(n,m)=(-1)^m*(n - m)!*Binomial[n - 1, m] + (-1)^(n - m + 1)*(n - (n - m + 1))!*Binomial[n - 1, n - m + 1].
 * @author Sean A. Irvine
 */
public class A176862 extends Sequence3 {

  private int mN = 3;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 2;
    }
    return Z.NEG_ONE.pow(mM).multiply(Functions.FACTORIAL.z(mN - mM)).multiply(Binomial.binomial(mN - 1, mM))
      .add(Z.NEG_ONE.pow(mN - mM + 1).multiply(Functions.FACTORIAL.z(mM - 1)).multiply(Binomial.binomial(mN - 1, mN - mM + 1)));
  }
}
