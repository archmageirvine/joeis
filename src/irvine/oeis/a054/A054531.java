package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054531 Triangular array T read by rows: T(n,k) = n/gcd(n,k) (n &gt;= 1, 1 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A054531 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mN / Functions.GCD.l(mN, mM));
  }
}
