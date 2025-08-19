package irvine.oeis.a079;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079508 Triangle T(n,k) (n &gt;= 2, k &gt;= 1) of Raney numbers read by rows.
 * @author Sean A. Irvine
 */
public class A079508 extends Sequence1 {

  private int mN = 1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial(mM, mN - mM).multiply(Binomial.binomial(mN, mM + 1)).divide(mM);
  }
}
