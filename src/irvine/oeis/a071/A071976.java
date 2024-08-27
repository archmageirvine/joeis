package irvine.oeis.a071;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071976 Number of lists of length n from {0..9} summing to n but not beginning with 0.
 * @author Sean A. Irvine
 */
public class A071976 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> t = RING.pow(C, mN - 1, mN);
    return RING.multiply(t, C, mN).coeff(mN).subtract(t.coeff(mN));
  }
}
