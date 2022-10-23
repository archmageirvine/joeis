package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006262 Product k^(2^(k-2)), k = 2..n.
 * @author Sean A. Irvine
 */
public class A006262 extends Sequence1 {

  private int mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(Z.valueOf(mN).pow(1 << (mN - 2)));
    }
    return mA;
  }
}

