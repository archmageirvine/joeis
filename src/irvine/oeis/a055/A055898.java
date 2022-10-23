package irvine.oeis.a055;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055898 Triangle: Number of directed site animals on a square lattice with n+1 total sites and k sites supported in one particular way.
 * @author Sean A. Irvine
 */
public class A055898 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      Z s = Z.ZERO;
      for (long j = 0; j <= mN - mM - k; ++j) {
        s = s.signedAdd(((mN + mM - j) & 1) == 0, Binomial.binomial(mN - mM - k, j).multiply(Binomial.binomial(k + j, k)).multiply(Binomial.binomial(2 * j + 1, j + 1)));
      }
      sum = sum.add(s.multiply(Binomial.binomial(mN - k, mM)));
    }
    return sum;
  }
}
