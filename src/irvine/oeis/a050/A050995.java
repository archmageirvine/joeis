package irvine.oeis.a050;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A050995 Reduced denominators of series expansion for integrand in Renyi's parking constant.
 * @author Sean A. Irvine
 */
public class A050995 extends A050994 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
