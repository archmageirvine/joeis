package irvine.oeis.a210;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A210915 Number of transitive reflexive early confluent binary relations R on n labeled elements where |{y : xRy}| &lt;= 7 for all x.
 * @author Sean A. Irvine
 */
public class A210915 extends A210913 {

  @Override
  public Polynomial<Q> compute(final int n) {
    return mT.get(7, n);
  }
}
