package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.math.q.Q;

/**
 * A002298 Denominator of (2/Pi)*Integral_{0..inf} (sin x / x)^n dx.
 * @author Sean A. Irvine
 */
public class A002298 extends A002297 {

  @Override
  protected Z extract(final Q t) {
    return t.den();
  }
}
