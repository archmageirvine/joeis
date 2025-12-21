package irvine.oeis.a391;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391094 a(n) is the number of closed binary operations on a set of n labeled elements with empty center.
 * @author Sean A. Irvine
 */
public class A391094 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return Integers.SINGLETON.sum(0, mN, k -> Binomial.binomial(mN, k).multiply(n.pow(Binomial.binomial(k, 2))).multiply(Z.NEG_ONE.pow(mN - k)))
      .multiply(n.pow(Binomial.binomial(mN + 1, 2)));
  }
}
