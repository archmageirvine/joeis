package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005832 Product <code>k^(2^(k-1)), k = 1..n</code>.
 * @author Sean A. Irvine
 */
public class A005832 implements Sequence {

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
