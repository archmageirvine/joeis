package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034863 a(n) = n!*(4*n^3 - 30*n^2 + 40*n + 3)/24.
 * @author Sean A. Irvine
 */
public class A034863 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = 3;

  @Override
  public Z next() {
    if (++mN > 4) {
      mF = mF.multiply(mN);
    }
    return mF.multiply(Z.FOUR.multiply(mN).subtract(30).multiply(mN).add(40).multiply(mN).add(3));
  }
}
