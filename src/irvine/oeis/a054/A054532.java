package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054532 Ramanujan sum T(n, k) = c_k(n) = Sum_{m=1..k, (m,k)=1} exp(2*Pi*i*m*n / k), triangular array read by rows for n &gt;= 1 and 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A054532 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final long g = mM / Functions.GCD.l(mN, mM);
    return Z.valueOf(Functions.PHI.l(mM) * Functions.MOBIUS.i(g) / Functions.PHI.l(g));
  }
}
