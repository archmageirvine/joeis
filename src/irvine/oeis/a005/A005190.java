package irvine.oeis.a005;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005190 Central quadrinomial coefficients: largest coefficient of (1 + x + x^2 + x^3)^n.
 * @author Sean A. Irvine
 */
public class A005190 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> POLY = Polynomial.create(1, 1, 1, 1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.pow(POLY, mN, 3 * mN / 2).coeff(3 * mN / 2);
  }
}

