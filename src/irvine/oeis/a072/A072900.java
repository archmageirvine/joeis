package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072900 Discriminant of quadratic field Q(sqrt(prime(n))) where prime(n) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A072900 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.mod(4) == 1 ? p : p.multiply(4);
  }
}

