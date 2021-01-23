package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024956 a(n) = A024955(n+3)/7.
 * @author Sean A. Irvine
 */
public class A024956 extends A024955 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(7);
  }
}
