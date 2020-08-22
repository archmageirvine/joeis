package irvine.oeis.a027;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A027648 Denominators of poly-Bernoulli numbers B_n^(k) with k=4.
 * @author Sean A. Irvine
 */
public class A027648 extends A027647 {

  @Override
  protected Z select(final Q q) {
    return q.den();
  }
}
