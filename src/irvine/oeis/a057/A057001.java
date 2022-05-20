package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057001 (phi(n+1)-phi(n))/2.
 * @author Sean A. Irvine
 */
public class A057001 extends A057000 {

  {
    next();
    next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
