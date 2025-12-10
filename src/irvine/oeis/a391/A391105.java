package irvine.oeis.a391;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391105 a(n) = binomial(4*n,n) - binomial(3*n,n).
 * @author Sean A. Irvine
 */
public class A391105 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN).subtract(Binomial.binomial(3 * mN, mN));
  }
}
