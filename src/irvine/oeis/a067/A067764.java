package irvine.oeis.a067;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A067764 Numerators of the coefficients in exp(x/(1-x)) power series.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A067764 extends A067653 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}
