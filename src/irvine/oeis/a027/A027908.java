package irvine.oeis.a027;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027908 a(n) = T(2*n, n), T given by A027907.
 * @author Sean A. Irvine
 */
public class A027908 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, 1, 1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.pow(C, 2 * mN, mN).coeff(mN);
  }
}
