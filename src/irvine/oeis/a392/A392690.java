package irvine.oeis.a392;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A392690 a(n) = denominator( (-1)^(n-1)*H(2*n)/(2*n + 1) ), where H(n) is the n-th harmonic number.
 * @author Sean A. Irvine
 */
public class A392690 extends A392689 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
