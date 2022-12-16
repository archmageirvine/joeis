package irvine.oeis.a133;
// manually dersimple at 2022-12-15 22:48

import irvine.math.z.Z;
import irvine.oeis.a122.A122102;

/**
 * A133549 Sum of the fourth powers of the first n odd primes.
 * @author Georg Fischer
 */
public class A133549 extends A122102 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(16);
  }
}
