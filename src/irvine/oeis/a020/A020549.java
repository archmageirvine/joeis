package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020549 a(n) = (n!)^2 + 1.
 * @author Sean A. Irvine
 */
public class A020549 extends Sequence0 {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN).multiply(mN);
    }
    return mF.add(1);
  }
}
