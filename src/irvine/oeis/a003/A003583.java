package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003583 <code>a(n) = (n+2)*2^(2*n-1) -</code> (n/2)*binomial(2*n,n).
 * @author Sean A. Irvine
 */
public class A003583 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN + 2).shiftLeft(2 * mN - 1).subtract(Binomial.binomial(2 * mN, mN).multiply(mN).divide2());
  }
}
