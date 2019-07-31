package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024964 <code>a(n) = s(n+3)/2</code>, where s is <code>A024963</code>.
 * @author Sean A. Irvine
 */
public class A024964 extends A024963 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
