package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007566 <code>a(n+1) = (2n+3)*a(n) - 2n*a(n-1) + 8n, a(0) = 1, a(1) = 3</code>.
 * @author Sean A. Irvine
 */
public class A007566 implements Sequence {

  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    mA = mA.multiply(2 * ++mN).add(Z.valueOf(2 * mN - 1).square());
    return mA;
  }
}
