package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007144.
 * @author Sean A. Irvine
 */
public class A007144 extends A007141 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    return get(3, mN).subtract(get(2, mN).multiply(3)).add(get(1, mN).multiply(3));
  }
}
