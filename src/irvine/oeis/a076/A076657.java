package irvine.oeis.a076;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076657 a(n) = (1/24) * binomial(2n,n)*(16^n-binomial(2n,n)^2). Right side of identity involving series A005148.
 * @author Sean A. Irvine
 */
public class A076657 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z b = Binomial.binomial(2 * ++mN, mN);
    return Z.ONE.shiftLeft(4 * mN).subtract(b.square()).multiply(b).divide(24);
  }
}
