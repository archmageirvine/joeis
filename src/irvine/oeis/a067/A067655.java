package irvine.oeis.a067;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A067655 Denominators of the coefficients in exp(2x/(1-x)) power series.
 * @author Sean A. Irvine
 */
public class A067655 extends A067654 {

  {
    setOffset(1);
  }

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
