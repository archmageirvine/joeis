package irvine.oeis.a065;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A065518 Denominator of n/(sum of the digits of n).
 * @author Sean A. Irvine
 */
public class A065518 extends A065517 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
