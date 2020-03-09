package irvine.oeis.a029;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029895 Number of partitions of <code>floor(n^2/2)</code> with at most n parts and maximal height <code>n</code>.
 * @author Sean A. Irvine
 */
public class A029895 implements Sequence {

  private final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Polynomial<Z> num = RING.one();
    Polynomial<Z> den = RING.one();
    final int deg = mN * mN / 2;
    for (int k = 1; k <= mN; ++k) {
      num = RING.multiply(num, RING.oneMinusXToTheN(mN + k), deg);
      den = RING.multiply(den, RING.oneMinusXToTheN(k), deg);
    }
    return RING.coeff(num, den, deg);
  }
}
