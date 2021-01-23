package irvine.oeis.a027;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A027646 Denominators of poly-Bernoulli numbers B_n^(k) with k=3.
 * @author Sean A. Irvine
 */
public class A027646 extends A027645 {

  @Override
  protected Z select(final Q q) {
    return q.den();
  }
}
