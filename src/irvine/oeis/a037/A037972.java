package irvine.oeis.a037;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037972 a(n) = n^2*(n+1)*binomial(2*n-2, n-1)/2.
 * @author Sean A. Irvine
 */
public class A037972 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN - 2, mN - 1).multiply(mN + 1).multiply(mN).multiply(mN).divide2();
  }
}
