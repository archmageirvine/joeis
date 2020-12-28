package irvine.oeis.a005;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.IntegerField;
import irvine.math.group.MultivariatePolynomialField;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005202 Total number of fixed points in planted trees with n nodes.
 * @author Sean A. Irvine
 */
public class A005202 implements Sequence {

  protected static final MultivariatePolynomialField<Z> RING = new MultivariatePolynomialField<>(IntegerField.SINGLETON, 2);
  protected static final MultivariatePolynomial<Z> XY = RING.monomial(Z.ONE, new int[] {1, 1});

  protected MultivariatePolynomial<Z> mH = XY;

  private Z coeff(final int p, final int j) {
    return mH.extract(0, p).toPolynomial().coeff(j);
  }

  private MultivariatePolynomial<Z> xyOver1pxy(final int n) {
    final List<Z> coeffs = new ArrayList<>();
    final int[][] terms = new int[n][];
    for (int k = 1; k <= n; ++k) {
      coeffs.add((k & 1) == 1 ? Z.ONE : Z.NEG_ONE);
      terms[k - 1] = new int[] {k, k};
    }
    return new MultivariatePolynomial<>(IntegerField.SINGLETON, 2, terms, coeffs);
  }

  protected void step(final int pmax) {
    final int[] limits = {pmax, pmax};
    MultivariatePolynomial<Z> pp = RING.one();
    for (int p = 1; p <= pmax; ++p) {
      MultivariatePolynomial<Z> t = RING.one();
      for (int j = 1; j <= p; ++j) {
        final List<Z> coeffs = new ArrayList<>();
        final int[][] terms = new int[pmax + 2][];
        coeffs.add(Z.ONE);
        coeffs.add(Z.ONE);
        terms[0] = new int[] {0, 0};
        terms[1] = new int[] {p, j};
        for (int k = 2; k <= pmax + 1; ++k) {
          coeffs.add(Z.ONE);
          terms[k] = new int[] {k * p, 0};
        }
        final MultivariatePolynomial<Z> u = new MultivariatePolynomial<>(IntegerField.SINGLETON, 2, terms, coeffs);
        t = RING.multiply(t, RING.pow(u, coeff(p, j).longValueExact(), limits), limits);
      }
      pp = RING.multiply(pp, t, limits);
    }
    mH = RING.multiply(pp, xyOver1pxy(pmax), limits);
  }

  private int mN = -1;

  @Override
  public Z next() {
    //System.out.println(mH);
    if (++mN > 0) {
      step(mN);
    }
    Z sum = Z.ZERO;
    final Polynomial<Z> row = mH.extract(0, mN).toPolynomial();
    for (int j = 1; j <= mN; ++j) {
      sum = sum.add(row.coeff(j).multiply(j));
    }
    return sum;
  }
}

