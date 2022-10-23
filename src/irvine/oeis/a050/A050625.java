package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050625 Divisible by 3^k (where k is digit length of a(n)).
 * @author Sean A. Irvine
 */
public class A050625 extends Sequence1 {

  private long mN = 3;
  private long mLim = 10;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM * mN > mLim) {
      mN *= 3;
      mM = (mLim + mN - 1) / mN;
      mLim *= 10;
    }
    return Z.valueOf(mM).multiply(mN);
  }
}
