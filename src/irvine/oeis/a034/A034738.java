package irvine.oeis.a034;

import irvine.math.z.Euler;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034738 Dirichlet convolution of b_n = 2^(n-1) with phi(n).
 * @author Sean A. Irvine
 */
public class A034738 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Euler.phi((long) mN / d).shiftLeft(d - 1));
  }
}
