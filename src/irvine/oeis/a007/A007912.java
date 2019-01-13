package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007912.
 * @author Sean A. Irvine
 */
public class A007912 extends A007911 {

  @Override
  public Z next() {
    return super.next().mod(Z.valueOf(mN + 2));
  }
}
