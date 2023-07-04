package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a047.A047812;

/**
 * A007045 Second (lower) diagonal of partition triangle A047812.
 * @author Sean A. Irvine
 */
public class A007045 extends A047812 {

  private int mN = 1;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ZERO;
    }
    return get(mN).coeff((mN - 3) * (mN + 1));
  }
}
