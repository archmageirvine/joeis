package irvine.oeis.a099;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A099378 Denominators of the harmonic means of the divisors of the positive integers.
 * @author Sean A. Irvine
 */
public class A099378 extends A099377 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
