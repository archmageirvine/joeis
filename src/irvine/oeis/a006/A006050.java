package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006050 Smallest number of additive persistence <code>n</code>.
 * @author Sean A. Irvine
 */
public class A006050 implements Sequence {

  private long mN = -1;
  private Z mA = Z.TEN;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    } else if (mN > 1) {
      mA = Z.TEN.pow((mA.intValueExact() - 1) / 9).multiply2().subtract(1);
    }
    return mA;
  }
}

