package irvine.oeis.a047;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A047688 Denominators of coefficients in Taylor series for exp(sin(x)).
 * @author Sean A. Irvine
 */
public class A047688 extends A047687 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
