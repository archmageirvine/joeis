package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395627 Infinite square array T(n,k) = (prime(n)-1)*prime(n)^k/2; n, k &gt;= 1; read by falling antidiagonals.
 * @author Sean A. Irvine
 */
public class A395627 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return Functions.PRIME.z(n).subtract(1).multiply(Functions.PRIME.z(n).pow(m)).divide2();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM + 1);
  }
}
