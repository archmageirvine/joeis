package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024948 <code>a(n) = s(n+3)/3</code>, where s is <code>A024947</code>.
 * @author Sean A. Irvine
 */
public class A024948 extends A024947 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}
