package irvine.oeis.a038;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038195 Triangle read by rows: T(n,k) (n &gt;= 2, 0 &lt;= k &lt;= n) = number of over-all crude totals of unbranched k-5-catapolyheptagons.
 * @author Sean A. Irvine
 */
public class A038195 implements Sequence {

  private int mN = 1;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN - 1, mM - 1).shiftLeft(2).add(Binomial.binomial(mN - 2, mM)).shiftLeft(2 * mN - mM - 4);
  }
}
