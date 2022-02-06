package irvine.oeis.a054;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054521 Triangle read by rows: T(n,k) = 1 if gcd(n, k) = 1, T(n,k) = 0 otherwise (n &gt;= 1, 1 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A054521 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return LongUtils.gcd(mN, mM) == 1 ? Z.ONE : Z.ZERO;
  }
}
