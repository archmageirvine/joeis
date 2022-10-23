package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026004 a(n) = T(3n+1,n), where T = Catalan triangle (A008315).
 * @author Sean A. Irvine
 */
public class A026004 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN + 1, mN).multiply(mN + 2).divide(2 * mN + 2);
  }
}
