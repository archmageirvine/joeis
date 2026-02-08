package irvine.oeis.a083;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A083688 Denominator of B(2n)*H(2n)/n where B(k) is the k-th Bernoulli number and H(k) the k-th harmonic number.
 * @author Sean A. Irvine
 */
public class A083688 extends A083687 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
