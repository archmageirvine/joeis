package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066399 From reversion of e.g.f. for squares.
 * @author Sean A. Irvine
 */
public class A066399 extends Sequence0 {

  private int mN = -2;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN + 1);
    return Z.NEG_ONE.pow(mN).multiply(Integers.SINGLETON.sum(0, mN, k -> {
      return n.pow(k).multiply(Functions.FACTORIAL.z(mN)).multiply(Binomial.binomial(2L * mN - k, mN)).divide(Functions.FACTORIAL.z(k));
    }));
  }
}
