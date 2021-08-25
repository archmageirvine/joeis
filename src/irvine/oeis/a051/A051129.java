package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051129 Table T(n,k) = k^n read by upwards antidiagonals (n &gt;= 1, k &gt;= 1).
 * @author Sean A. Irvine
 */
public class A051129 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM <= 0) {
      mM = ++mN;
    }
    return Z.valueOf(mN - mM + 1).pow(mM);
  }
}
