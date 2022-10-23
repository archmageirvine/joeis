package irvine.oeis.a033;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A033281 Number of diagonal dissections of a convex (n+9)-gon into n+1 regions.
 * @author Sean A. Irvine
 */
public class A033281 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 6, 6).multiply(Binomial.binomial(2 * mN + 8, mN)).divide(mN + 1);
  }
}

