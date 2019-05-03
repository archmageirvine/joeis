package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a000.A000252;

/**
 * A020479 Number of noninvertible <code>2 X 2</code> matrices over <code>Z/nZ (determinant</code> is a divisor of <code>0)</code>.
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
