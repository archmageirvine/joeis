package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A072899 Denominator of c(n) where c(0)=1 c(n+1) = n/c(n) + 1.
 * @author Sean A. Irvine
 */
public class A072899 extends A072898 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

