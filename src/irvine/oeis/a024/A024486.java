package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024486 a(n) = (1/(2n+1))*Multinomial(3n; n,n,n).
 * @author Sean A. Irvine
 */
public class A024486 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.multinomial(3 * mN, mN, mN, mN).divide(2 * mN + 1);
  }
}
