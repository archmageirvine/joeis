package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048229 a(n)=T(n,n), array T given by A048225.
 * @author Sean A. Irvine
 */
public class A048229 extends A048224 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
