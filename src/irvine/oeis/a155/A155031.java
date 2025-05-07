package irvine.oeis.a155;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A155031 Triangle T(n, k) = 0 if n==0 (mod k) otherwise -1 with T(n, n) = 1 and T(n, 0) = 0, read by rows.
 * @author Sean A. Irvine
 */
public class A155031 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mM == mN
      ? Z.ONE
      : mN % mM == 0 ? Z.ZERO : Z.NEG_ONE;
  }
}
