package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025006 a(1) = 7; a(n+1) = a(n)-th nonprime, where nonprimes begin at 1.
 * @author Sean A. Irvine
 */
public class A025006 extends A025003 {

  @Override
  protected Z initial() {
    return Z.SEVEN;
  }
}
