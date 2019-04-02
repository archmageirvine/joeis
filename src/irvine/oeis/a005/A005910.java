package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005910 Truncated octahedral numbers: 16*n^3 - 33*n^2 + 24*n - 6.
 * @author Sean A. Irvine
 */
public class A005910 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(16).subtract(33).multiply(mN).add(24).multiply(mN).subtract(6);
  }
}
