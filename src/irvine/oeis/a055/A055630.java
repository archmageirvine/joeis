package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055630 Table T(k,m) = k^2 + m read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A055630 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf((mN - mM) * (mN - mM) + mM);
  }
}
