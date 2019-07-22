package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024730 <code>a(n) = s(n+3)/5</code>, where s is <code>A024729</code>.
 * @author Sean A. Irvine
 */
public class A024730 extends A024729 {

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
