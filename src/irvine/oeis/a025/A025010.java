package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025010 a(1) = 5; a(n+1) = a(n)-th nonprime, where nonprimes begin at 4.
 * @author Sean A. Irvine
 */
public class A025010 extends A025000 {

  @Override
  protected Z initial() {
    return Z.FIVE;
  }

  @Override
  protected Z start() {
    return Z.FOUR;
  }
}
