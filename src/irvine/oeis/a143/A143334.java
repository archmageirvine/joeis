package irvine.oeis.a143;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A143334 Triangle read by rows: T(n,0) = T(n,n) = 1, T(n,k) = prime(n) + 1 - (binomial(n, k) mod 2).
 * @author Sean A. Irvine
 */
public class A143334 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    if (m == 0 || m == n) {
      return Z.ONE;
    }
    return Functions.PRIME.z(n).add(1 - Binomial.binomial(n, m, 2));
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
