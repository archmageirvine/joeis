package irvine.oeis.a225;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A225923 Expansion of q^(-1/2) * k(q) * (1 - k(q)^4) * (K(q) / (pi/2))^6 / 4 in powers of q where k(), k'(), K() are Jacobi elliptic functions.
 * @author Sean A. Irvine
 */
public class A225923 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> a = RING.one();
    Polynomial<Z> b = RING.one();
    for (int k = 1; k <= mN; ++k) {
      final Polynomial<Z> c = RING.oneMinusXToTheN(k);
      a = RING.multiply(a, c, mN);
      b = RING.multiply(b, RING.multiply(c, RING.pow(RING.oneMinusXToTheN(4 * k), 2, mN), mN));
    }
    return RING.pow(a, 12, mN).coeff(mN).add(RING.pow(b, 4, mN).shift(1).coeff(mN).multiply(32));
  }
}
