package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A051789 C(n)*(C(n)-1)/2, where C(n) are the Catalan numbers (A000108).
 * @author Sean A. Irvine
 */
public class A051789 extends A000108 {

  @Override
  public Z next() {
    final Z c = super.next();
    return c.multiply(c.subtract(1)).divide2();
  }
}

