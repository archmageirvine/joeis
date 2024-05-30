package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054535 Square array giving Ramanujan sum T(n,k) = c_n(k) = Sum_{m=1..n, (m,n)=1} exp(2 Pi i m k / n), read by antidiagonals upwards (n &gt;= 1, k &gt;= 1).
 * @author Sean A. Irvine
 */
public class A054535 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final long n = mN + 1 - mM;
    final long g = n / Functions.GCD.l(n, mM);
    return Z.valueOf(Functions.PHI.l(n) * Functions.MOBIUS.i(g) / Functions.PHI.l(g));
  }
}
