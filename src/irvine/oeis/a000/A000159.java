package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000159 Coefficients of m\u00e9nage hit polynomials.
 * @author Sean A. Irvine
 */
public class A000159 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000159(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000159() {
    super(3);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> BASE = Polynomial.create(-1, 1);
  private final MemoryFactorial mFactorial = MemoryFactorial.SINGLETON;

  // This will be useful for other sequences
  Polynomial<Z> menageHitPolynomial(final int n) {
    Polynomial<Z> p = RING.zero();
    for (int k = 0; k <= n; ++k) {
      final long u = 2L * n - k;
      final Z m = Binomial.binomial(u, k)
        .multiply(2L * n)
        .multiply(mFactorial.factorial(n - k))
        .divide(u);
      p = RING.add(p, RING.multiply(RING.pow(BASE, k), m));
    }
    return p;
  }

  private int mN = 2;

  @Override
  public Z next() {
    return menageHitPolynomial(++mN).coeff(3);
  }
}
