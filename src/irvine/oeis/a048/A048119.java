package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048119 a(n)=(1/2)*T(2n+1,n+1), where T is given by A048113.
 * @author Sean A. Irvine
 */
public class A048119 extends A048118 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
