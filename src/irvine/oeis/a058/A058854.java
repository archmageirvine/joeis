package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000172;

/**
 * A058854 a(n) = largest prime in the factorization of n-th Franel number (A000172).
 * @author Sean A. Irvine
 */
public class A058854 extends A000172 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).largestPrimeFactor();
  }
}
