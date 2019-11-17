package irvine.oeis.a027;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A027648 Denominators of poly-Bernoulli numbers <code>B_n^(k)</code> with <code>k=4</code>.
 * @author Sean A. Irvine
 */
public class A027648 extends A027647 {

  @Override
  protected Z select(final Q q) {
    return q.den();
  }
}
