package irvine.oeis.a049;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A049331 Denominator of (1/Pi)*Integral_{0..oo} (sin x / x)^n dx.
 * @author Sean A. Irvine
 */
public class A049331 extends A049330 {

  private long mDiv = 2;

  @Override
  protected Z select(final Q n) {
    final Z r = n.den().divide(mDiv);
    mDiv = 1;
    return r;
  }
}
