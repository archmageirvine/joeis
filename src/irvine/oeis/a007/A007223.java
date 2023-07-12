package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A007223 Number of distinct perforation patterns for deriving (v,b) = (n+2,n) punctured convolutional codes from (2,1).
 * @author Sean A. Irvine
 */
public class A007223 extends MemoryFunction2Sequence<Integer, Polynomial<Z>> {

  /** Construct the sequence. */
  public A007223() {
    super(2);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 1;

  @Override
  protected Polynomial<Z> compute(final Integer b, final Integer v) {
    Polynomial<Z> p = RING.zero();
    for (final Z dd : Jaguar.factor(b).divisors()) {
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
