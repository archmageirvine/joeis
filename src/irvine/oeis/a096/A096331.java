package irvine.oeis.a096;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a100.A100960;

/**
 * A096331 Number of 2-connected planar graphs on n labeled nodes.
 * @author Sean A. Irvine
 */
public class A096331 extends A100960 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 2;

  @Override
  public Z next() {
    return RING.eval(series(++mN).coeff(mN), Q.ONE).toZ();
  }
}
