package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024954 a(n) = s(n+3)/6, where s is A024953.
 * @author Sean A. Irvine
 */
public class A024954 extends A024953 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(6);
  }
}
