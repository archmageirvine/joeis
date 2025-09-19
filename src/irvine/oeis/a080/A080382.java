package irvine.oeis.a080;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080382 Triangle read by rows: T(n,k) = C(n,floor(n/2))/gcd(C(n,floor(n/2)),C(n,k)), k=0..n; central binomial coefficient is divided by greatest common divisor of binomial coefficients and corresponding central binomial coefficient.
 * @author Sean A. Irvine
 */
public class A080382 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    final Z c = Binomial.binomial(mN, mN / 2);
    return c.divide(c.gcd(Binomial.binomial(mN, mM)));
  }
}
