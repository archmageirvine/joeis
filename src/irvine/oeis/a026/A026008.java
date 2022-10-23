package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026008 a(n) = T(n, floor(n/2)), where T = Catalan triangle (A008315).
 * @author Sean A. Irvine
 */
public class A026008 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return (++mN & 1) == 0
      ? Binomial.binomial(mN + 2, mN / 2 + 1).divide(mN / 2 + 2)
      : Binomial.binomial(mN + 1, mN / 2).multiply(3).divide(mN / 2 + 3);
  }
}

