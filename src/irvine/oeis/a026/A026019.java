package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026019 a(n) = binomial(3*n,n) - binomial(3*n,n-3).
 * @author Sean A. Irvine
 */
public class A026019 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN, mN).subtract(Binomial.binomial(3 * mN, mN - 3));
  }
}

