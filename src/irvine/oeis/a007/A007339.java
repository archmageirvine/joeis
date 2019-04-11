package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007339 <code>a(n) = n! - n^3</code>.
 * @author Sean A. Irvine
 */
public class A007339 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.subtract(Z.valueOf(mN).pow(3));
  }
}
