package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036070 Expansion of (-1+1/(1-4*x)^4)/(16*x); related to A038846.
 * @author Sean A. Irvine
 */
public class A036070 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 4, 3).shiftLeft(2 * mN - 2);
  }
}
