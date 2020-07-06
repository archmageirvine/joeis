package irvine.oeis.a033;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033281 Number of diagonal dissections of a convex <code>(n+9)-gon</code> into <code>n+1</code> regions.
 * @author Sean A. Irvine
 */
public class A033281 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 6, 6).multiply(Binomial.binomial(2 * mN + 8, mN)).divide(mN + 1);
  }
}

