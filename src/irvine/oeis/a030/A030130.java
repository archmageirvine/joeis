package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030130 Binary expansion contains a single 0.
 * @author Sean A. Irvine
 */
public class A030130 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      if (++mN == 1) {
        return Z.ZERO;
      }
      mM = mN - 2;
    }
    return Z.ONE.shiftLeft(mN).subtract(Z.ONE.shiftLeft(mM)).subtract(1);
  }
}
