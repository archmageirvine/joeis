package irvine.oeis.a064;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a010.A010815;

/**
 * A064512 Ramanujan's function F_7(q).
 * @author Sean A. Irvine
 */
public class A064512 extends A010815 {

  private static final Polynomial<Z> NQ = Polynomial.create(0, -1);
  private static final Polynomial<Z> NQ7 = Polynomial.create(0, 0, 0, 0, 0, 0, 0, -1);

  @Override
  public Z next() {
    super.next();
    final Polynomial<Z> f1 = RING.substitute(mGf, NQ, mN);
    final Polynomial<Z> f7 = RING.substitute(mGf, NQ7, mN);
    return RING.coeff(RING.pow(f1, 7, mN), f7, mN)
      .add(RING.coeff(RING.multiply(RING.pow(f7, 7, mN), Z.SEVEN).shift(2), f1, mN))
      .add(RING.multiply(RING.multiply(RING.pow(f1, 3, mN), Z.SEVEN).shift(1), RING.pow(f7, 3, mN), mN).coeff(mN));
  }
}

