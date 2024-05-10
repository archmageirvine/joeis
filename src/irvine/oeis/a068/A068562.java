package irvine.oeis.a068;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A068562 Denominators of coefficients in (1+x)^(1/3)-(1-x)^(1/3) power series.
 * @author Sean A. Irvine
 */
public class A068562 extends A068561 {

  {
    setOffset(1);
  }

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

