package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059214 Square array T(k,n) = C(n-1,k) + Sum_{i=0..k} C(n,i) read by antidiagonals (k &gt;= 1, n &gt;= 1).
 * @author Sean A. Irvine
 */
public class A059214 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return Binomial.binomial(n - 1, m).add(Integers.SINGLETON.sum(0, m, k -> Binomial.binomial(n, k)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mM, mN + 1 - mM);
  }
}
