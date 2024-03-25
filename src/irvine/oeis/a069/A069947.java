package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a068.A068885;

/**
 * A069947 Denominator of Sum_{k=1..n} k/phi(k).
 * @author Sean A. Irvine
 */
public class A069947 extends A068885 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
