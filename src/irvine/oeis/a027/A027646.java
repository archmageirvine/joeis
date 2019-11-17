package irvine.oeis.a027;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A027646 Denominators of poly-Bernoulli numbers <code>B_n^(k)</code> with <code>k=3</code>.
 * @author Sean A. Irvine
 */
public class A027646 extends A027645 {

  @Override
  protected Z select(final Q q) {
    return q.den();
  }
}
