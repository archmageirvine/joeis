package irvine.oeis.a283;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A283924 Denominators of poly-Bernoulli numbers B_n^(k) with k=6.
 * @author Georg Fischer
 */
public class A283924 extends A283923 {

  @Override
  protected Z select(final Q q) {
    return q.den();
  }
}
