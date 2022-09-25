package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A059428 Number of points of rotation in a prime block spiral.
 * @author Sean A. Irvine
 */
public class A059428 extends A000040 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    Z p = Z.ZERO;
    final long lim = mN * mN / 4;
    while (mM <= lim) {
      ++mM;
      p = super.next();
    }
    return p;
  }
}
