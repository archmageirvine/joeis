package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025003 <code>a(1) = 2; a(n+1) = a(n)-th</code> nonprime, where nonprimes begin at 1.
 * @author Sean A. Irvine
 */
public class A025003 extends A025000 {

  @Override
  protected Z initial() {
    return Z.TWO;
  }

  @Override
  protected Z start() {
    return Z.ONE;
  }
}
