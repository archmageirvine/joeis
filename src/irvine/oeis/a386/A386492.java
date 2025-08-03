package irvine.oeis.a386;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A386492 Array read by ascending antidiagonals: A(n,m) = numerator(n*(m^2 - 1)/(m^2 + 1)), where m &gt; 0.
 * @author Sean A. Irvine
 */
public class A386492 extends A386490 {

  @Override
  protected Q t(final long n, final long m) {
    return new Q(Z.valueOf(m * m - 1).multiply(n), m * m + 1);
  }
}
