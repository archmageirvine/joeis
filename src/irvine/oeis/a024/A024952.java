package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024952 a(n) = s(n+3)/5, where s is A024951.
 * @author Sean A. Irvine
 */
public class A024952 extends A024951 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(5);
  }
}
