package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A001761.
 * @author Sean A. Irvine
 */
public class A001761 extends A000108 {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return super.next().multiply(mF);
  }
}
