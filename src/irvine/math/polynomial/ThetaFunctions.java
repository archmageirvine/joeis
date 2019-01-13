package irvine.math.polynomial;

import irvine.math.group.PolynomialRing;
import irvine.math.group.QPolynomialRing;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * Compute various theta polynomials
 *
 * @author Sean A. Irvine
 */
public final class ThetaFunctions {

  private ThetaFunctions() { }

  /**
   * Compute the third Jacobi theta function to degree <code>n</code>.
   * @param n degree
   * @return theta function
   */
  public static Polynomial<Z> theta3z(final int n) {
    final long[] coeff = new long[n + 1];
    coeff[0] = 1;
    for (int k = 1; k * k <= n; ++k) {
      coeff[k * k] = 2;
    }
    return Polynomial.create(coeff);
  }

  /**
   * Compute the fourth Jacobi theta function to degree <code>n</code>.
   * @param n degree
   * @return theta function
   */
  public static Polynomial<Z> theta4z(final int n) {
    final long[] coeff = new long[n + 1];
    coeff[0] = 1;
    for (int k = 1; k * k <= n; ++k) {
      coeff[k * k] = (k & 1) == 0 ? 2 : -2;
    }
    return Polynomial.create(coeff);
  }

  /**
   * The psi function, <code>sum_{m=-infty}^infty q^(m+1/k)^2</code>.
   * @param k parameter
   * @param maxDegree maximum degree of terms guaranteed to include
   * @return psi function
   */
  public static QPolynomial<Z> psi(final Q k, final Q maxDegree) {
    final QPolynomial<Z> psi = new QPolynomial<>("q", Z.ZERO, Z.ONE);
    final Q invK = k.reciprocal();
    // Deal with m == 0
    psi.put(invK.square(), Z.ONE);
    long m = 1;
    Q q;
    while ((q = invK.subtract(m).square()).compareTo(maxDegree) <= 0) {
      psi.put(q, psi.coeff(q).add(Z.ONE));
      final Q r = invK.add(m).square();
      if (r.compareTo(maxDegree) <= 0) {
        psi.put(r, psi.coeff(r).add(Z.ONE));
      }
      ++m;
    }
    return psi;
  }

  /**
   * The psi function, <code>sum_{m=-infty}^infty q^(m+1/k)^2</code>.
   * @param k parameter
   * @param maxDegree maximum degree of terms guaranteed to include
   * @return psi function
   */
  public static QPolynomial<Z> psi(final int k, final int maxDegree) {
    return psi(new Q(k), new Q(maxDegree));
  }

  /**
   * Compute the second Jacobi theta function to specified degree.
   * @param maxDegree degree
   * @return theta function
   */
  public static QPolynomial<Z> theta2(final Q maxDegree) {
    return psi(Q.TWO, maxDegree);
  }

  /**
   * Compute the second Jacobi theta function to specified degree.
   * @param maxDegree degree
   * @return theta function
   */
  public static QPolynomial<Z> theta2(final int maxDegree) {
    return theta2(new Q(maxDegree));
  }

  /**
   * Compute the fourth power of the second Jacobi theta function to specified degree.
   * @param maxDegree degree
   * @return theta function
   */
  public static Polynomial<Z> theta2z4(final int maxDegree) {
    return RING.pow(theta2(new Q(maxDegree)), 4, maxDegree).toPolynomial();
  }

  /**
   * Compute the third Jacobi theta function to degree <code>n</code>.
   * @param n degree
   * @return theta function
   */
  public static QPolynomial<Z> theta3(final Q n) {
    final QPolynomial<Z> theta3 = new QPolynomial<>("q", Z.ZERO, Z.ONE);
    theta3.put(Q.ZERO, Z.ONE);
    Q k = Q.ONE;
    Q v;
    while ((v = k.square()).compareTo(n) <= 0) {
      theta3.put(v, Z.TWO);
      k = k.add(1);
    }
    return theta3;
  }

  /**
   * Compute the third Jacobi theta function to degree <code>n</code>.
   * @param n degree
   * @return theta function
   */
  public static QPolynomial<Z> theta3(final int n) {
    return theta3(new Q(n));
  }

  private static final Z NEG_TWO = Z.valueOf(-2);

  /**
   * Compute the fourth Jacobi theta function to degree <code>n</code>.
   * @param n degree
   * @return theta function
   */
  public static QPolynomial<Z> theta4(final Q n) {
    final QPolynomial<Z> theta4 = new QPolynomial<>("q", Z.ZERO, Z.ONE);
    theta4.put(Q.ZERO, Z.ONE);
    Z k = Z.ONE;
    Q v;
    while ((v = new Q(k.square())).compareTo(n) <= 0) {
      theta4.put(v, k.isEven() ? Z.TWO : NEG_TWO);
      k = k.add(1);
    }
    return theta4;
  }

  /**
   * Compute the fourth Jacobi theta function to degree <code>n</code>.
   * @param n degree
   * @return theta function
   */
  public static QPolynomial<Z> theta4(final int n) {
    return theta4(new Q(n));
  }

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);

  /**
   * Compute the <code>delta8</code> function.
   * @param n maximum degree
   * @return polynomial
   */
  public static QPolynomial<Z> delta8(final int n) {
    QPolynomial<Z> delta8 = new QPolynomial<>("q", Z.ZERO, Z.ONE);
    delta8.put(Q.ONE, Z.ONE); // q
    for (int m = 1; 2 * m <= n; ++m) {
      final QPolynomial<Z> t = RING.multiply(RING.oneMinusXToTheN(Z.ONE, new Q(2 * m - 1)), RING.oneMinusXToTheN(Z.ONE, new Q(4 * m)), n);
      delta8 = RING.multiply(delta8, RING.pow(t, 8, n), n);
    }
    return delta8;
  }

  private static final PolynomialRing<Z> RINGZ = new PolynomialRing<>(Integers.SINGLETON);

  /**
   * Compute the <code>delta24</code> function squared and shifted.
   * @param n maximum degree
   * @return polynomial
   */
  public static Polynomial<Z> delta24z2(final int n) {
    return delta24z((n + 2) / 2).substitutePower(2).shift(-2);
  }

  /**
   * Compute the <code>delta24</code> function.
   * @param n maximum degree
   * @return polynomial
   */
  public static Polynomial<Z> delta24z(final int n) {
    Polynomial<Z> gf = Polynomial.create(0, 0, 1);
    for (int k = 1; k <= n; ++k) {
      gf = RINGZ.multiply(gf, RINGZ.pow(RINGZ.oneMinusXToTheN(k), 24, n), n);
    }
    return gf;
  }

}
