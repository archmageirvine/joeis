package irvine.oeis.a027;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A027644 Denominators of poly-Bernoulli numbers <code>B_n^(k)</code> with <code>k=2</code>.
 * @author Sean A. Irvine
 */
public class A027644 extends A027643 {

  @Override
  protected Z select(final Q q) {
    return q.den();
  }
}
