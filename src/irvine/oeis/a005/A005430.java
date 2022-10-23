package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005430 Ap\u00e9ry numbers: n*C(2*n,n).
 * @author Sean A. Irvine
 */
public class A005430 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN).multiply(mN);
  }
}
