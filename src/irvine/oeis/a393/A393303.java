package irvine.oeis.a393;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A393303 Denominator of Sum_{k=1..floor((n+1)/2)} binomial(n, 2*k-2) * c(k), where c(k) = A002430(k)/A036279(k) is the k-th positive coefficient in the Taylor series for tan(x).
 * @author Sean A. Irvine
 */
public class A393303 extends A393302 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
