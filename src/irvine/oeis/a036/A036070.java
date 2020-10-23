package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036070 Expansion of (-1+1/(1-4*x)^4)/(16*x); related to A038846.
 * @author Sean A. Irvine
 */
public class A036070 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 4, 3).shiftLeft(2 * mN - 2);
  }
}
