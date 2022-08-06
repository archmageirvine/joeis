package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048121 a(n) = (1/2)*T(2n,n+1), where T is given by A048113.
 * @author Sean A. Irvine
 */
public class A048121 extends A048120 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
