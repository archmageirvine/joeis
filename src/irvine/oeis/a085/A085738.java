package irvine.oeis.a085;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A085738 Denominators in triangle formed from Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class A085738 extends A085737 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
