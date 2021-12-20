package irvine.oeis.a210;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A210912 Number of transitive reflexive early confluent binary relations R on n labeled elements where |{y : xRy}| &lt;= 4 for all x.
 * @author Sean A. Irvine
 */
public class A210912 extends A210913 {

  @Override
  public Polynomial<Q> compute(final int n) {
    return mT.get(4, n);
  }
}
