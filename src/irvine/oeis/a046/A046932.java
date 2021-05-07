package irvine.oeis.a046;

import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046932.
 * @author Sean A. Irvine
 */
public class A046932 implements Sequence {

  // Only good for a few terms

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(new GaloisField(2));
  private static final Polynomial<Z> X1 = RING.onePlusXToTheN(1);
  private int mN = 0;

  @Override
  public Z next() {
    final Polynomial<Z> modulus = RING.add(RING.monomial(Z.ONE, ++mN), X1);
    int m = 0;
    while (true) {
      if (RING.zero().equals(RING.mod(RING.oneMinusXToTheN(++m), modulus))) {
        return Z.valueOf(m);
      }
    }
  }
}
