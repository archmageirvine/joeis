package irvine.oeis.a350;

import irvine.math.function.Functions;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A350730 Number of strongly connected oriented graphs on n labeled nodes.
 * @author Gregory Morse
 */
public class A350730 extends A350731 {
  private static final Polynomial<Q> TWO = RING_Y.monomial(Q.TWO, 0);
  private int mN = 0;

  @Override
  public Z next() {
    return row(++mN, 0, TWO).coeff(0).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
