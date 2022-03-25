package irvine.oeis.a055;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A055535 Denominators in expansion of (1-x)^(-1/x)/e.
 * @author Sean A. Irvine
 */
public class A055535 extends A055505 {

  @Override
  protected Z select(final Q sum) {
    return sum.den();
  }
}
