package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070070 Rounded value of n*L_n(-1) where L is the Laguerre polynomial.
 * @author Sean A. Irvine
 */
public class A070070 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Rationals.SINGLETON.sum(0, ++mN, k -> new Q(Z.ONE, Functions.FACTORIAL.z(k)).multiply(Binomial.binomial(mN, k))).multiply(mN).round();
  }
}
