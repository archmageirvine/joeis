package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048117 a(n)=(1/2)*T(2n,n), where T is given by A048113.
 * @author Sean A. Irvine
 */
public class A048117 extends A048116 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
