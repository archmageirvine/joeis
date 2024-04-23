package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a060.A060253;

/**
 * A066277 Primes p(m) such that a prime number q exists so that p(m)-q = c(m), the m-th composite number.
 * @author Sean A. Irvine
 */
public class A066277 extends A060253 {

  @Override
  public Z next() {
    return Functions.PRIME.z(super.next());
  }
}
