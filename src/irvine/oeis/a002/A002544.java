package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002544 a(n) = binomial(2*n+1,n)*(n+1)^2.
 * @author Sean A. Irvine
 */
public class A002544 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN + 1, mN).multiply(Z.valueOf(mN + 1).square());
  }
}
