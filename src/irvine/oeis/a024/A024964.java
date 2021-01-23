package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024964 a(n) = s(n+3)/2, where s is A024963.
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
