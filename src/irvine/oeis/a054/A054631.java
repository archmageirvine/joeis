package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054631 Triangle read by rows: row n (n &gt;= 1) contains the numbers T(n,k) = Sum_{d|n} phi(d)*k^(n/d)/n, for k=1..n.
 * @author Sean A. Irvine
 */
public class A054631 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Integers.SINGLETON.sumdiv(mN, d -> {
      return Functions.PHI.z(Z.valueOf(d)).multiply(Z.valueOf(mM).pow(mN / d));
    }).divide(mN);
  }
}
