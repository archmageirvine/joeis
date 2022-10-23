package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036914 a(n) = binomial(2*n,n)*binomial(3*n,2*n)^4.
 * @author Sean A. Irvine
 */
public class A036914 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN).multiply(Binomial.binomial(3 * mN, 2 * mN).pow(4));
  }
}
