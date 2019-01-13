package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007227.
 * @author Sean A. Irvine
 */
public class A007227 extends A007223 {

  private int mN = 1;

  @Override
  public Z next() {
    return get(++mN, 3).coeff(mN + 2);
  }
}
