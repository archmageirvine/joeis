package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036561 Nicomachus triangle read by rows, T(n, k) = 2^(n - k)*3^k, for 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A036561 implements Sequence {

  private int mN = -1;
  private int mM = 0;
  private Z mA = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mA = null;
    }
    mA = mA == null ? Z.ONE : mA.multiply(3);
    return mA.shiftLeft(mN - mM);
  }
}
