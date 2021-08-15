package irvine.oeis.a050;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050383 Permutation rooted trees with n nodes.
 * @author Sean A. Irvine
 */
public class A050383 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> a = RING.onePlusXToTheN(1);
    for (int i = 1; i <= mN; ++i) {
      Polynomial<Z> b = RING.one();
      for (int k = 1; k <= mN; ++k) {
        b = RING.multiply(b, RING.subtract(RING.one(), a.substitutePower(k, mN).shift(k)), mN);
      }
      a = RING.series(RING.one(), b, mN);
    }
    return a.coeff(mN);
  }
}
