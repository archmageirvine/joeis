package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004013 Theta series of body-centered cubic (b.c.c.) lattice.
 * @author Sean A. Irvine
 */
public class A004013 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  protected int mN = -1;

  /**
   * Ramanujan psi function.
   * @param n maximum order
   * @return psi function
   */
  public static Polynomial<Z> psi(final int n) {
    final long[] coeff = new long[n + 1];
    for (int k = 0; k * (k + 1) / 2 <= n; ++k) {
      coeff[k * (k + 1) / 2] = 1;
    }
    return Polynomial.create(coeff);
  }

  /**
   * Ramanujan phi function.
   * @param n maximum order
   * @return phi function
   */
  public static Polynomial<Z> phi(final int n) {
    final long[] coeff = new long[n + 1];
    coeff[0] = 1;
    for (int k = 1; k * k <= n; ++k) {
      coeff[k * k] = 2;
    }
    return Polynomial.create(coeff);
  }

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> p = RING.pow(phi(mN).substitutePower(8), 3, 4 * mN);
    final Polynomial<Z> q = RING.multiply(RING.pow(psi(mN).substitutePower(2), 3, mN), Z.EIGHT).substitutePower(4).shift(3);
    return p.coeff(2 * mN).add(q.coeff(mN));
  }
}
