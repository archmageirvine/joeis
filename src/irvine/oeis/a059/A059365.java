package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059365 Another version of the Catalan triangle: T(r,s) = binomial(2*r-s-1,r-1) - binomial(2*r-s-1,r), r&gt;=0, 0 &lt;= s &lt;= r.
 * @author Sean A. Irvine
 */
public class A059365 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(2 * mN - mM - 1, mN - 1).subtract(Binomial.binomial(2 * mN - mM - 1, mN));
  }
}
