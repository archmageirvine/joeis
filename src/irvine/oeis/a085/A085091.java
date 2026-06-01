package irvine.oeis.a085;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A085091 Denominator of Sum_{i=2..t} (d(i)/d(i-1)-1), where d(1), ..., d(t) are the divisors of n.
 * @author Sean A. Irvine
 */
public class A085091 extends A085085 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
