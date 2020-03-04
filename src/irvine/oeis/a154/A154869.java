package irvine.oeis.a154;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A154869 A triangular sequence: <code>t0(n,m) = Sum[(-1)^j*Binomial[n + 2, j]*(m - j + 1)^(n + 1), {j, 0, m + 1}]; t1(n,m)=-Sum[(-1)^j*t0[n + 2, j]*(m - j + 1)^(n + 1), {j, 0, m + 1}]; t(n,m)=t1(n,m)+t1(n,n-m)</code>.
 * @author Sean A. Irvine
 */
public class A154869 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  private Z t1(final int n, final int m) {
    Z sum = Z.ZERO;
    for (long j = 0; j <= m; ++j) {
      sum = sum.add(Binomial.binomial(mN + 4, j + 2).multiply(j + 2).multiply(Z.valueOf(m - j + 1).pow(n + 1)));
    }
    return sum.divide(n + 4);
  }

  private Z t(final int n, final int m) {
    Z sum = Z.ZERO;
    for (long j = 0; j <= m + 1; ++j) {
      sum = sum.add(Binomial.binomial(mN + 4, j + 2).multiply(j + 2).multiply(Z.valueOf(m - j + 1).pow(n + 1).add(Z.valueOf(n + 1 - j - m).pow(n + 1))));
    }
    return sum.divide(n + 4);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    //return t(mN, mM);
    return t1(mN, mM).add(t1(mN, mN - mM));
  }
}
