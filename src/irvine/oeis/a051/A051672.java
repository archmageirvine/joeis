package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051672 Triangle of up-down sums of k-th powers: a(n,k)=sum(i^k,i=1..n)+sum((n-i)^k,i=1..n-1), n,k&gt;0.
 * @author Sean A. Irvine
 */
public class A051672 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int m) {
    Z sum = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      sum = sum.add(Z.valueOf(k).pow(m));
    }
    for (int k = 1; k < n; ++k) {
      sum = sum.add(Z.valueOf(n - k).pow(m));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN - mM + 1, mM);
  }
}
