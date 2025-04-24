package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076953 Array T(m,n) = phi(mn)-phi(m)phi(n) (m,n &gt;= 1), read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A076953 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return Functions.PHI.z(n * m).subtract(Functions.PHI.z(n).multiply(Functions.PHI.z(m)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mM, mN - mM + 1);
  }
}

