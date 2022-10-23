package irvine.oeis.a050;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050169 Triangle read by rows: T(n,k) = gcd(C(n,k), C(n,k-1)), n &gt;= 1, 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A050169 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial(mN, mM).gcd(Binomial.binomial(mN + 1, mM));
  }
}
