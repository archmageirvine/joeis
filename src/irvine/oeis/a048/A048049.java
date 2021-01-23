package irvine.oeis.a048;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a028.A028415;

/**
 * A048049 Denominator of Sum_{k=1..n} 1/phi(k).
 * @author Sean A. Irvine
 */
public class A048049 extends A028415 {

  @Override
  protected Z select(final Q sum) {
    return sum.den();
  }
}
