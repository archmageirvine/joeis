package irvine.oeis.a066;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066170 Triangle read by rows: T(n,k) = (-1)^n*(-1)^(floor(3*k/2))*binomial(floor((n+k)/2),k), 0 &lt;= k &lt;= n, n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A066170 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.NEG_ONE.pow(mN + 3 * mM / 2).multiply(Binomial.binomial((mN + mM) / 2, mM));
  }
}
