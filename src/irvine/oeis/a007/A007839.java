package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001037;

/**
 * A007839 Number of polynomials of degree n over GF(2) in which the degrees of all irreducible factors are distinct.
 * @author Sean A. Irvine
 */
public class A007839 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Sequence s = new A001037();
    s.next();
    Polynomial<Z> gf = RING.one();
    for (int k = 1; k <= mN; ++k) {
      gf = RING.multiply(gf, RING.onePlusXToTheN(s.next(), k), mN);
    }
    return gf.coeff(mN);
  }
}
