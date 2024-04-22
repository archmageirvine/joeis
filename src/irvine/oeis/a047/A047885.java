package irvine.oeis.a047;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047885 Array a(m,n) = pi(m+n) - pi(m) - pi(n) read by antidiagonals, where pi() = A000720 (m,n &gt;= 0).
 * @author Sean A. Irvine
 */
public class A047885 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    return Z.valueOf(Functions.PRIME_PI.l(n + m) - Functions.PRIME_PI.l(m) - Functions.PRIME_PI.l(n));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}

