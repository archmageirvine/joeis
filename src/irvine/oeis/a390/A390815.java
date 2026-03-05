package irvine.oeis.a390;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A390815 Denominators &gt; 1 of ratio n!/sigma(n), where n! = factorial of n (A000142) and sigma(n) = sum of divisors of n (A000203).
 * @author Sean A. Irvine
 */
public class A390815 extends A390836 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
