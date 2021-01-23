package irvine.oeis.a029;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029840 Expansion of Product_{m&gt;=1} ((1+q^(2*m-1))/(1+q^(2*m)))^3.
 * @author Sean A. Irvine
 */
public class A029840 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  protected int power() {
    return 3;
  }

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> num = RING.one();
    Polynomial<Z> den = RING.one();
    for (int k = 1; k <= mN; ++k) {
      num = RING.multiply(num, RING.onePlusXToTheN(2 * k - 1), mN);
      den = RING.multiply(den, RING.onePlusXToTheN(2 * k), mN);
    }
    return RING.coeff(RING.pow(num, power(), mN), RING.pow(den, power(), mN), mN);
  }
}
