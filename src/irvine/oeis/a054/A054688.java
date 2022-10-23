package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054688 Number of nonnegative integer n X n matrices with sum of elements equal to n; polynomial symmetric functions of matrix of order n.
 * @author Sean A. Irvine
 */
public class A054688 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN * mN + mN - 1, mN);
  }
}
