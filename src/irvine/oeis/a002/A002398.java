package irvine.oeis.a002;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002398 Coefficients for step-by-step integration.
 * @author Sean A. Irvine
 */
public class A002398 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002398(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002398() {
    super(0);
  }

  // After Jack Grahl

  static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  Z l(final int n) {
    if (n == 0) {
      return Z.ONE;
    }
    final Z p = l(n - 1);
    return p.lcm(Z.valueOf(n + 1));
  }

  private Z lfac(final int n) {
    return mF.factorial(n).multiply(l(n));
  }

  Z bigA(final int n, final int m) {
    return lfac(m).divide(lfac(n));
  }

  Z gamma(final int p, final int j) {
    return (p & 1) == 0 ? Binomial.binomial(j, p) : Binomial.binomial(j, p).negate();
  }

  Z alef(final int n) {
    Polynomial<Z> a = RING.one();
    for (int i = 0; i < n; ++i) {
      a = RING.multiply(a, Polynomial.create(i, 1));
    }
    Z x = Z.ZERO;
    for (int d = 0; d <= a.degree(); ++d) {
      final Z b = a.coeff(d);
      if (!Z.ZERO.equals(b)) {
        x = x.add(b.multiply(l(n).divide(d + 1)));
      }
    }
    return x;
  }

  Z delta(final int p, final int j) {
    Z sum = Z.ZERO;
    for (int k = p; k <= j; ++k) {
      sum = sum.add(gamma(p, k).multiply(bigA(k, j)).multiply(alef(k)));
    }
    return sum;
  }

  @Override
  public Z next() {
    return delta(0, ++mN);
  }
}
