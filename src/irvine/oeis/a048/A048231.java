package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048231 a(n)=T(n+2,n), array T given by A048225.
 * @author Sean A. Irvine
 */
public class A048231 extends A048224 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(5);
  }
}
