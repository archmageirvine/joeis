package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A020651 Denominators in recursive bijection from positive integers to positive rationals (the bijection is f(1) <code>= 1,</code> f(2n) = f(n)+1, f(2n+1) = 1/(f(n)+1)).
 * @author Sean A. Irvine
 */
public class A020651 extends A020650 {

  @Override
  protected Z select(final Q a) {
    return a.den();
  }
}
