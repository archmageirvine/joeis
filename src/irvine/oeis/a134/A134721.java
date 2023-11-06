package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.a000.A000668;

/**
 * A134721 Bisection of Mersenne primes A000668.
 * @author Georg Fischer
 */
public class A134721 extends A000668 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}
