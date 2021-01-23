package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025001 a(1) = 5; a(n+1) = a(n)-th nonprime, where nonprimes begin at 0.
 * @author Sean A. Irvine
 */
public class A025001 extends A025000 {

  @Override
  protected Z initial() {
    return Z.FIVE;
  }
}
