package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389606 allocated for Ryan Z. Liu.
 * @author Sean A. Irvine
 */
public class A389606 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final long x = (mN - 1 - Math.abs(2 * mM - (mN + 1))) / 2;
    final Z sign = Z.NEG_ONE.pow(x);
    return Z.ONE.add(sign).multiply(mN + 1).divide2().subtract(sign.multiply(mM));
  }
}
