package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047907 a(n+1) = a(n) - n (if n is even), a(n+1) = a(n) * n (if n is odd).
 * @author Sean A. Irvine
 */
public class A047907 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    mA = (++mN & 1) == 1 ? mA.multiply(mN) : mA.subtract(mN);
    return mA;
  }
}
