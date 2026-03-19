package irvine.oeis.a176;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A176063 Asymmetrical triangle sequence:t(n,m)=(-1)^m* Binomial[n, m] Pochhammer[ -n, m] - (-1)^n Pochhammer[ -n, n] + (-1)^( n - m)* Binomial[n, -m + n] Pochhammer[ -n, -m + n].
 * @author Sean A. Irvine
 */
public class A176063 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.NEG_ONE.pow(mM).multiply(Binomial.binomial(mN, mM)).multiply(Functions.POCHHAMMER.z(-mN, mM))
      .add(Z.NEG_ONE.pow(mN - mM).multiply(Binomial.binomial(mN, mN - mM)).multiply(Functions.POCHHAMMER.z(-mN, mN - mM)))
      .subtract(Functions.FACTORIAL.z(mN));
  }
}
