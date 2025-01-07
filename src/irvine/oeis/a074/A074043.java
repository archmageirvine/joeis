package irvine.oeis.a074;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A074043 Denominator of Sum_{k=1..n} 1/A077800(k), numerator=A074042.
 * @author Sean A. Irvine
 */
public class A074043 extends A074042 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
