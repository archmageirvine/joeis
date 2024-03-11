package irvine.oeis.a283;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A283922 Denominators of poly-Bernoulli numbers B_n^(k) with k=5.
 * @author Georg Fischer
 */
public class A283922 extends A283921 {

  @Override
  protected Z select(final Q q) {
    return q.den();
  }
}
