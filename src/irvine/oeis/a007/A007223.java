package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.MemoryFunction2;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007223 Number of distinct perforation patterns for deriving (v,b)=(n+2,n) punctured convolutional codes from <code>(2,1)</code>.
 * @author Sean A. Irvine
 */
public class A007223 extends MemoryFunction2<Integer, Polynomial<Z>> implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 1;

  @Override
  protected Polynomial<Z> compute(final Integer b, final Integer v) {
    Polynomial<Z> p = RING.zero();
    for (final Z dd : Cheetah.factor(b).divisors()) {
      final int d = dd.intValue();
      p = RING.add(p, RING.multiply(RING.pow(RING.onePlusXToTheN(d), v * b / d), Euler.phi(dd)));
    }
    return RING.divide(p, Z.valueOf(b));
  }

  @Override
  public Z next() {
    return get(++mN, 2).coeff(mN + 2);
  }
}
