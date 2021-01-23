package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A004111 Number of rooted identity trees with n nodes (rooted trees whose automorphism group is the identity group).
 * @author Sean A. Irvine
 */
public class A004111 extends MemorySequence {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  protected int mN = -1;

  @Override
  protected Z computeNext() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    Polynomial<Z> p = RING.one();
    for (int k = 1; k < mN; ++k) {
      p = RING.multiply(p, RING.pow(RING.onePlusXToTheN(k), get(k), mN - 1), mN - 1);
    }
    return p.coeff(mN - 1);
  }
}

