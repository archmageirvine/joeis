package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024950 a(n) = s(n+3)/4, where s is A024949.
 * @author Sean A. Irvine
 */
public class A024950 extends A024949 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}
