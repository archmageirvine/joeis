package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A005147 Denominators of numbers occurring in continued fraction connected with expansion of gamma function.
 * @author Sean A. Irvine
 */
public class A005147 extends A005146 {

  @Override
  protected Z value(final Q q) {
    return q.den();
  }
}
