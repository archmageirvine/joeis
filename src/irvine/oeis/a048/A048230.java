package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048230 a(n)=T(n+1,n), array T given by A048225.
 * @author Sean A. Irvine
 */
public class A048230 extends A048224 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(4);
  }
}
