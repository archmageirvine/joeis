package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002663 a(n) = 2^n - C(n,0) - C(n,1) - C(n,2) - C(n,3).
 * @author Sean A. Irvine
 */
public class A002663 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).subtract(mN + 1).subtract(Binomial.binomial(mN, 2)).subtract(Binomial.binomial(mN, 3));
  }
}
