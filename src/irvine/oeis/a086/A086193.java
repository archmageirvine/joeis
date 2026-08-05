package irvine.oeis.a086;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086193 Number of n X n matrices with entries in {0,1} with no zero row, no zero column and with zero main diagonal.
 * @author Sean A. Irvine
 */
public class A086193 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, r -> Binomial.binomial(mN, r).multiply(Z.ONE.shiftLeft(r - 1).subtract(1).pow(r)).multiply(Z.ONE.shiftLeft(r).subtract(1).pow(mN - r)).multiply(Z.NEG_ONE.pow(mN - r)));
  }
}

