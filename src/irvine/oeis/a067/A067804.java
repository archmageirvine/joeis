package irvine.oeis.a067;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067804 Triangle read by rows: T(n,k) is the number of walks (each step +-1) of length 2n which have a cumulative value of 0 last at step 2k.
 * @author Sean A. Irvine
 */
public class A067804 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return Binomial.binomial(2 * m, m).multiply(Binomial.binomial(2 * n - 2 * m, n - m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
