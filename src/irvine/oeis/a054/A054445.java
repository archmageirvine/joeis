package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054445 Triangle read by rows giving partial row sums of triangle A033184(n,m), n &gt;= m &gt;= 1 (Catalan triangle).
 * @author Sean A. Irvine
 */
public class A054445 implements Sequence {

  private long mN = 0;
  private long mM = 0;
  private Z mT = null;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mT = Binomial.catalan(mN);
    } else {
      mT = mT.subtract(Binomial.binomial(2 * mN - mM, mN).multiply(mM).divide(2 * mN - mM));
    }
    return mT;
  }
}
