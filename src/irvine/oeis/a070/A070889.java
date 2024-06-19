package irvine.oeis.a070;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A070889 Denominator of Sum_{k=1..n} mu(k)/k.
 * @author Sean A. Irvine
 */
public class A070889 extends A070888 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
