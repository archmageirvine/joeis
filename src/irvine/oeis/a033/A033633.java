package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033633 Primes modulo 19.
 * @author Sean A. Irvine
 */
public class A033633 extends A000040 {

  private static final Z Z19 = Z.valueOf(19);

  @Override
  public Z next() {
    return super.next().mod(Z19);
  }
}
