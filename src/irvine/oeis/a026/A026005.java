package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026005 a(n) = T(4*n,n), where T = Catalan triangle (A008315).
 * @author Sean A. Irvine
 */
public class A026005 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN + 1, mN).multiply(2 * mN + 2).divide(3 * mN + 2);
  }
}
