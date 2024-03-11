package irvine.oeis.a283;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A283926 Denominators of poly-Bernoulli numbers B_n^(k) with k=7.
 * @author Georg Fischer
 */
public class A283926 extends A283925 {

  @Override
  protected Z select(final Q q) {
    return q.den();
  }
}
