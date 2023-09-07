package irvine.oeis.a065;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A065602 Triangle T(n,k) giving number of hill-free Dyck paths of length 2n and having height of first peak equal to k.
 * @author Sean A. Irvine
 */
public class A065602 extends Sequence2 {

  private int mN = 2;
  private int mM = 1;

  private Z t(final int n, final int m) {
    return Integers.SINGLETON.sum(0, (n - m) / 2, k -> Binomial.binomial(2L * n - m - 1 - 2L * k, n - 1).multiply(m - 1 + 2L * k).divide(2L * n - m - 1 - 2L * k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 2;
    }
    return t(mN, mM);
  }
}

