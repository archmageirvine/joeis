package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a049.A049281;

/**
 * A069685 Denominators of coefficients in -log(1+x)log(1-x) power series.
 * @author Sean A. Irvine
 */
public class A069685 extends A049281 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
