package irvine.oeis.a006;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006027.
 * @author Sean A. Irvine
 */
public class A006027 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C1 = Polynomial.create(-2, 2);
  private static final Polynomial<Z> C2 = Polynomial.create(1, -3, 2);
  private static final Polynomial<Z> C3 = Polynomial.create(0, 0, -1, 1);

  private int mN = 0;
  private Polynomial<Z> mGf = RING.zero();

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Polynomial<Z> t = RING.add(RING.add(RING.add(RING.pow(mGf, 3, mN),
      RING.multiply(RING.pow(mGf, 2, mN), C1)),
      RING.multiply(mGf, C2)),
      C3);
    final Z coeff = t.coeff(mN).negate();
    mGf = RING.add(mGf, RING.monomial(coeff, mN));
    return coeff;
  }
}

