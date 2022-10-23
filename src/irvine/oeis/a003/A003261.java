package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003261 Woodall (or Riesel) numbers: n*2^n - 1.
 * @author Sean A. Irvine
 */
public class A003261 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).shiftLeft(mN).subtract(1);
  }

}
