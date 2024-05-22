package irvine.oeis.a190;
// manually sigman1/sigma1 at 2023-02-28 22:58

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a065.A065509;

/**
 * A190527 Primes of the form p^4 + p^3 + p^2 + p + 1, where p is prime.
 * @author Georg Fischer
 */
public class A190527 extends A065509 {

  @Override
  public Z next() {
    return Functions.SIGMA1.z(super.next().pow(4));
  }
}
