package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007711 Number of unreformed permutations of <code>{1,</code>...,n}.
 * @author Sean A. Irvine
 */
public class A007711 extends A007709 {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.subtract(super.next());
  }

}
