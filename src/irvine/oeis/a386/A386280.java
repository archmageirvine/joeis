package irvine.oeis.a386;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a066.A066328;

/**
 * A386280 Numbers k &gt; 1 such that A066328(k) / A001222(k) = x + 1/2 for some x &gt;= 0.
 * @author Sean A. Irvine
 */
public class A386280 extends A066328 {

  private long mN = 1;
  {
    super.next(); // skip n=1 for which Omega(1)=0
  }

  @Override
  public Z next() {
    while (true) {
      if (new Q(super.next(), Functions.BIG_OMEGA.z(++mN)).den().equals(Z.TWO)) {
        return Z.valueOf(mN);
      }
    }
  }
}
