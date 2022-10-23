package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026020 a(n) = binomial(4n, n) - binomial(4n, n - 3).
 * @author Sean A. Irvine
 */
public class A026020 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, mN).subtract(Binomial.binomial(4 * mN, mN - 3));
  }
}

