package irvine.oeis.a037;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037964 a(n) = (1/2)*(binomial(4*n, 2*n) - (-1)^n*binomial(2*n,n)).
 * @author Sean A. Irvine
 */
public class A037964 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, 2 * mN).signedAdd((mN & 1) == 1, Binomial.binomial(2 * mN, mN)).divide2();
  }
}
