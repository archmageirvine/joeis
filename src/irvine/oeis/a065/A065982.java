package irvine.oeis.a065;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065982 a(n) = (n+1)*binomial(2*n,n) - 2^(2*n-1).
 * @author Sean A. Irvine
 */
public class A065982 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN).multiply(mN + 1).subtract(Z.ONE.shiftLeft(2 * mN - 1));
  }
}
