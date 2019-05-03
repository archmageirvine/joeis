package irvine.oeis.a009;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009766 Catalan's triangle <code>T(n,k)</code> (read by <code>rows)</code>: each term is the sum of the entries above and to the left, i.e., <code>T(n,k) = Sum_{j=0..k} T(n-1,j)</code>.
 * @author Sean A. Irvine
 */
public class A009766 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN + mM, mN).multiply(mN - mM + 1).divide(mN + 1);
  }
}
