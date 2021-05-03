package irvine.oeis.a046;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a123.A123125;

/**
 * A046802 T(n, k) = Sum_{j=k..n} binomial(n, j)*E1(j, j-k), where E1 are the Eulerian numbers A173018. Triangle read by rows, T(n, k) for 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A046802 extends A123125 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    Z sum = Z.ZERO;
    for (int k = mM - 1; k < mN; ++k) {
      sum = sum.add(Binomial.binomial(mN - 1, k).multiply(t(k, mM - 1)));
    }
    return sum;
  }
}
