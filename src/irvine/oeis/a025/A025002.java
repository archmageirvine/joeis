package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025002 <code>a(1) = 7; a(n+1) = a(n)-th</code> nonprime, where nonprimes begin at 0.
 * @author Sean A. Irvine
 */
public class A025002 extends A025000 {

  @Override
  protected Z initial() {
    return Z.SEVEN;
  }
}
