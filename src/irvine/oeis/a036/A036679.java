package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036679 a(n) = n^n - n!.
 * @author Sean A. Irvine
 */
public class A036679 implements Sequence {

  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return Z.valueOf(mN).pow(mN).subtract(mF);
  }
}
