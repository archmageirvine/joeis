package irvine.oeis.a064;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a010.A010815;

/**
 * A064511 Ramanujan's function F_5(q).
 * @author Sean A. Irvine
 */
public class A064511 extends A010815 {

  private static final Polynomial<Z> NQ = Polynomial.create(0, -1);
  private static final Polynomial<Z> NQ5 = Polynomial.create(0, 0, 0, 0, 0, -1);

  @Override
  public Z next() {
    super.next();
    final Polynomial<Z> f1 = RING.substitute(mGf, NQ, mN);
    final Polynomial<Z> f5 = RING.substitute(mGf, NQ5, mN);
    return RING.coeff(RING.pow(f1, 5, mN), f5, mN)
      .add(RING.coeff(RING.multiply(RING.pow(f5, 5, mN), Z.FIVE).shift(1), f1, mN));
  }
}
