package irvine.oeis.a061;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A061464 Denominator of 1 + 1/(2^2) + 1/(3^3) + ... 1/(n^n).
 * @author Sean A. Irvine
 */
public class A061464 extends A061463 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
