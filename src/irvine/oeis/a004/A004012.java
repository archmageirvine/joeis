package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004012 Theta series of hexagonal close-packing.
 * @author Sean A. Irvine
 */
public class A004012 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A004012(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A004012() {
    super(0);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NEGX = RING.negate(RING.x());

  private int mN = -1;

  private Polynomial<Z> a0(final int n, final int m) {
    final long[] coeff = new long[n + 1];
    coeff[0] = 1;
    for (int k = 1; m * k * k <= n; ++k) {
      coeff[m * k * k] = 2;
    }
    return Polynomial.create(coeff);
  }

  private Polynomial<Z> a0(final int n) {
    return RING.multiply(a0(n, 3), RING.multiply(a0(n, 8), a0(n, 9), n), n);
  }

  private Polynomial<Z> a1(final int n) {
    final Polynomial<Z> t0 = RING.pow(RING.eta(RING.monomial(Z.ONE, 9), n), 3, n);
    final Polynomial<Z> t1 = RING.pow(RING.eta(RING.monomial(Z.ONE, 32), n), 2, n);
    final Polynomial<Z> num = RING.multiply(t0, t1, n).shift(3);
    final Polynomial<Z> den = RING.multiply(RING.eta(RING.monomial(Z.ONE, 3), n), RING.eta(RING.monomial(Z.ONE, 16), n), n);
    return RING.series(num, den, n);
  }

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> a0 = a0(mN);
    final Polynomial<Z> gf = RING.subtract(RING.add(RING.multiply(a0, Z.TWO), RING.multiply(a1(mN), Z.SIX)), RING.substitute(a0, NEGX, mN));
    return gf.coeff(mN);
  }
}
