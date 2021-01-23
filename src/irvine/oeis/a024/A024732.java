package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024732 a(n) = s(n+3)/6, where s is A024731.
 * @author Sean A. Irvine
 */
public class A024732 extends A024731 {

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
