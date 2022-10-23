package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051127 Table T(n,k) = k mod n read by antidiagonals (n &gt;= 1, k &gt;= 1).
 * @author Sean A. Irvine
 */
public class A051127 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf((mN - mM + 1) % mM);
  }
}
