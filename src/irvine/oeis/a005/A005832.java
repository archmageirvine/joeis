package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005832 Product k^(2^(k-1)), k = 1..n.
 * @author Sean A. Irvine
 */
public class A005832 extends Sequence1 {

  private Z mA = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      if (mN == 33) {
        throw new UnsupportedOperationException();
      }
      mA = mA.multiply(Z.valueOf(mN).pow(1 << (mN - 1)));
    }
    return mA;
  }
}
