package irvine.oeis.a027;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027911 a(n) = T(2*n+1,n), with T given by A027907.
 * @author Sean A. Irvine
 */
public class A027911 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, 1, 1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.pow(C, 2 * mN + 1, mN).coeff(mN);
  }
}
