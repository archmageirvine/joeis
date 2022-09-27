package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059117 Square array of lambda(k,n), where lambda is defined in A055203. Number of ways of placing n identifiable positive intervals with a total of exactly k starting and/or finishing points.
 * @author Sean A. Irvine
 */
public class A059117 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  protected Z lambda(final int k, final int n) {
    Z sum = Z.ZERO;
    for (int j = 0; j <= k; ++j) {
      sum = sum.signedAdd(((k + j) & 1) == 0, Binomial.binomial(k, j).multiply(Z.valueOf((j - 1) * (long) j / 2).pow(n)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return lambda(mN - mM, mM);
  }
}
