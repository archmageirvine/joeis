package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A008837 a(n) = p*(p-1)/2 for p = prime(n).
 * @author Sean A. Irvine
 */
public class A008837 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.multiply(p.subtract(1)).divide2();
  }
}

