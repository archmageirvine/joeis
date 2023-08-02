package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000515 a(n) = (2n)!(2n+1)!/n!^4, or equally (2n+1)*binomial(2n,n)^2.
 * @author Sean A. Irvine
 */
public class A000515 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2L * mN, mN).square().multiply(2L * mN + 1);
  }
}
