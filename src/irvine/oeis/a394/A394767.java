package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394767 Number of numbers k &lt;= 2^n such that k is neither squareful nor squarefree.
 * @author Sean A. Irvine
 */
public class A394767 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z s = Z.ONE.shiftLeft(++mN);
    Z res = s.add(1);
    final long lim1 = Functions.CBRT.l(s);
    for (long j = 1; j <= lim1; ++j) {
      final int mu = Functions.MOBIUS.i(j);
      if (mu != 0) {
        res = res.subtract(CR.valueOf(new Q(s, Z.valueOf(j).pow(3))).sqrt().floor());
      }
    }
    final long lim2 = s.sqrt().longValueExact();
    for (long k = 1; k <= lim2; ++k) {
      final int mu = Functions.MOBIUS.i(k);
      if (mu != 0) {
        res = res.subtract(s.divide(Z.valueOf(k).square()).multiply(mu));
      }
    }
    return res;
  }
}
