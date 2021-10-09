package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A051790 a(n) = C(n)*(C(n)-1)*(C(n)-2)/6, where C(n) are the Catalan numbers (A000108).
 * @author Sean A. Irvine
 */
public class A051790 extends A000108 {

  @Override
  public Z next() {
    final Z c = super.next();
    return c.multiply(c.subtract(1)).multiply(c.subtract(2)).divide(6);
  }
}

