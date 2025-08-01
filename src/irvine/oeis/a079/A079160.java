package irvine.oeis.a079;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A079160 Satisfies A(x)^2 = (1 + sum_{n=1..inf} A079159(n)*p_n*x^n) = A079161(x), where p_n is the n-th prime.
 * @author Sean A. Irvine
 */
public class A079160 extends A079159 {

  @Override
  protected Z select(final long p, final long k, final Q s) {
    return s.toZ();
  }
}
