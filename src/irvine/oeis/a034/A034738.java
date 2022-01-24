package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034738 Dirichlet convolution of b_n = 2^(n-1) with phi(n).
 * @author Sean A. Irvine
 */
public class A034738 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Cheetah.factor(mN / d).phi().shiftLeft(d - 1));
  }
}
