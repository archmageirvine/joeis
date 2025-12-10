package irvine.oeis.a391;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391048 Triangle read by rows: T(n,k) = binomial(n+1,k+1) * binomial(5*n-4*k+1,k) / (n+1), 0&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A391048 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN + 1, mM + 1).multiply(Binomial.binomial(5 * mN - 4 * mM + 1, mM)).divide(mN + 1);
  }
}
