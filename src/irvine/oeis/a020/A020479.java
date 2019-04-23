package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a000.A000252;

/**
 * A020479 Number of noninvertible 2 X 2 matrices over Z/nZ (determinant is a divisor of 0).
 * @author Sean A. Irvine
 */
public class A020479 extends A000252 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z a = super.next();
    return Z.valueOf(mN).pow(4).subtract(a);
  }
}
