package irvine.oeis.a049;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A049456 Triangle T(n,k) = denominator of fraction in k-th term of n-th row of variant of Farey series. This is also Stern's diatomic array read by rows (version 1).
 * @author Sean A. Irvine
 */
public class A049456 extends A049455 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
