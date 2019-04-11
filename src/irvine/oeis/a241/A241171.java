package irvine.oeis.a241;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A241171 Triangle read by rows: Joffe's central differences of zero, T(n,k), <code>1 &lt;=</code> k <code>&lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A241171 implements Sequence {

  protected Z joffeDifference(final int n, final int k) {
    Z s = Z.ZERO;
    for (int j = 1; j <= k; ++j) {
      s = s.signedAdd(((k - j) & 1) == 0, Binomial.binomial(2L * k, k - j).multiply(Z.valueOf(j).pow(2 * n)));
    }
    return s.shiftRight(k - 1);
  }

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return joffeDifference(mN, mM);
  }
}
