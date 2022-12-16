package irvine.oeis.a133;
// manually dersimple at 2022-12-15 22:48

import irvine.math.z.Z;
import irvine.oeis.a098.A098999;

/**
 * A133548 a(n) = sum of cubes of first n odd primes.
 * @author Georg Fischer
 */
public class A133548 extends A098999 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(8);
  }
}
