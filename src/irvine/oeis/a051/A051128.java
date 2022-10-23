package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051128 Table T(n,k) = n^k read by upwards antidiagonals (n &gt;= 1, k &gt;= 1).
 * @author Sean A. Irvine
 */
public class A051128 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mN - mM + 1).pow(mM);
  }
}
