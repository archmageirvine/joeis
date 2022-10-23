package irvine.oeis.a187;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A187273 a(n) = (n/4)*3^(n/2)*((1+sqrt(3))^2+(-1)^n*(1-sqrt(3))^2).
 * @author Sean A. Irvine
 */
public class A187273 extends Sequence0 {

  private Z mThrees = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      return mThrees.multiply(2L * mN);
    } else {
      mThrees = mThrees.multiply(3);
      return mThrees.multiply(mN);
    }
  }
}
