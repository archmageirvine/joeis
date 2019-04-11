package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006906 <code>a(n) =</code> sum of products of terms in all partitions of n.
 * @author Sean A. Irvine
 */
public class A006906 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int k = 0; k <= mN; ++k) {
      prod = RING.multiply(prod, RING.oneMinusXToTheN(Z.valueOf(k), k), mN);
    }
    return RING.coeff(RING.one(), prod, mN);
  }
}
