package irvine.oeis.a065;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065350 a(n) = binomial(2*n, n) mod (n+1)^2.
 * @author Sean A. Irvine
 */
public class A065350 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z m = Z.valueOf(++mN + 1).multiply(mN + 1);
    return Binomial.binomial(2L * mN, mN).mod(m);
  }
}
