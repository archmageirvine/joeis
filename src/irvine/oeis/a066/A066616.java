package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066616 a(1) = 1; a(n) = n*a(n-1) if n does not divide a(n-1), otherwise a(n) = a(n-1).
 * @author Sean A. Irvine
 */
public class A066616 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.mod(mN) == 0 ? mA : mA.multiply(mN);
    }
    return mA;
  }
}
