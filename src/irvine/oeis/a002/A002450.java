package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002450 a(n) = (4^n - 1)/3.
 * @author Sean A. Irvine
 */
public class A002450 extends Sequence0 {

  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return Z.ONE.shiftLeft(mN).subtract(Z.ONE).divide(Z.THREE);
  }
}
