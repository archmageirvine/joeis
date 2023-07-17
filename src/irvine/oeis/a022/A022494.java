package irvine.oeis.a022;

import java.util.Arrays;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a137.A137251;

/**
 * A022494 Number of connected regular linearized chord diagrams of degree n.
 * @author Sean A. Irvine
 */
public class A022494 extends A137251 {

  /** Construct the sequence. */
  public A022494() {
    super(0);
  }

  // After Gheorghe Coserea

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final PolynomialRingField<Polynomial<Z>> RING2 = new PolynomialRingField<>("t", RING);
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Polynomial<Polynomial<Z>> r = new Polynomial<>("t", RING.zero(), RING.one());
    r.add(RING.zero());
    r.add(RING.one());
    for (int n = 2; n <= mN; ++n) {
      final Polynomial<Z> c = new Polynomial<>("x", Z.ZERO, Z.ONE);
      c.add(Z.ZERO);
      for (int k = 0; k <= mN; ++k) {
        c.add(RING.create(Arrays.asList(get(k, 0, 0))).shift(2).coeff(n));
      }
      r.add(c);
    }
    return RING2.eval(RING2.series(RING2.x(), RING2.reversion(r, mN), mN), RING.one()).coeff(mN - 1);
  }
}
