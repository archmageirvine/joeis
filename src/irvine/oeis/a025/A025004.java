package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025004 a(1) = 3; a(n+1) = a(n)-th nonprime, where nonprimes begin at 1.
 * @author Sean A. Irvine
 */
public class A025004 extends A025003 {

  @Override
  protected Z initial() {
    return Z.THREE;
  }
}
