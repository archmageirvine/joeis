package irvine.oeis.a036;

import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A036673 Number of stereoisomers of all n-node acyclic hydrocarbons with no triple bonds.
 * @author Sean A. Irvine
 */
public class A036673 extends A036672 {

  @Override
  public Z next() {
    final MultivariatePolynomial<Q> ln = step();
    return ln.eval(Q.ONE, Q.ZERO).toZ();
  }
}
