package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007566 a(n+1) = (2n+3)*a(n) - 2n*a(n-1) + 8n, a(0) = 1, a(1) = 3.
 * @author Sean A. Irvine
 */
public class A007566 extends Sequence0 {

  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    mA = mA.multiply(2 * ++mN).add(Z.valueOf(2 * mN - 1).square());
    return mA;
  }
}
