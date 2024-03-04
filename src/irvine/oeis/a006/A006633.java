package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006633 Expansion of hypergeom([3/2, 7/4, 2, 9/4], [7/3, 8/3, 3], (256/27)*x).
 * @author Sean A. Irvine
 */
public class A006633 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(4 * mN + 5, mN).multiply2().divide(mN + 2);
  }
}

