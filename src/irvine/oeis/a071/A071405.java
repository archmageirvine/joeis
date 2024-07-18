package irvine.oeis.a071;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071386.
 * @author Sean A. Irvine
 */
public class A071405 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final int pp = p.intValueExact();
    return Integers.SINGLETON.sum(0, pp, k -> Binomial.binomial(pp, k).multiply(Binomial.binomial(pp + k, k)))
      .subtract(Z.ONE.shiftLeft(pp))
      .subtract(1)
      .divide(p.square().multiply2());
  }
}
