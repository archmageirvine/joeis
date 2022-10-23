package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059250 Square array read by antidiagonals: T(k,n) = binomial(n-1, k) + Sum_{i=0..k} binomial(n, i), k &gt;= 1, n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A059250 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private Z t(final int k, final int n) {
    if (n == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(0, k - 1, i -> Binomial.binomial(n - 1, i)).multiply2();
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN + 1 - mM, mM);
  }
}

