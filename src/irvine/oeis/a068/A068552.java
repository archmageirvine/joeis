package irvine.oeis.a068;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068552 2n*binomial(2n,n) - 4^n.
 * @author Sean A. Irvine
 */
public class A068552 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN).multiply(2 * mN).subtract(Z.ONE.shiftLeft(2 * mN));
  }
}
