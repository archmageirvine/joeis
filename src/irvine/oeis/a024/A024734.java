package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024734 <code>a(n) = A024733(n+3)/7</code>.
 * @author Sean A. Irvine
 */
public class A024734 extends A024733 {

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
