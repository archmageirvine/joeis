package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A394977 Denominators of the coefficient of Pi^(2n+1) in Plouffe's formula for zeta(2n+1).
 * @author Sean A. Irvine
 */
public class A394977 extends A394976 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
