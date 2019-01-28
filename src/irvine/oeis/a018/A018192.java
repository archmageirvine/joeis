package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a081.A081054;

/**
 * A018192.
 * @author Sean A. Irvine
 */
public class A018192 extends A081054 {

  // todo not yet right, factor of approx 2 missing somewhere

  private Z gamma(final int d, final int c) {
    if ((c & 1) == 0) {
      Z sum = Z.ZERO;
      Z zc = Z.ONE;
      for (int i = 0; i <= d / 2; ++i) {
        if (i > 0) {
          zc = zc.multiply(c);
        }
        sum = sum.add(Binomial.binomial(d, 2 * i).multiply(zc).multiply(mF.doubleFactorial(2 * i - 1)));
      }
      return sum;
    } else if ((d & 1) == 0) {
      return Z.valueOf(c).pow(d / 2).multiply(mF.doubleFactorial(d - 1));
    } else {
      return Z.ZERO;
    }
  }

  private Z lambda(final int e, final int d, final int c) {
    return Binomial.binomial(e + d - 1, e).multiply(gamma(e, c));
  }

  private Polynomial<Z> lambdaStarSeries(final int k, final int c, final int n) {
    Polynomial<Z> sum = RING.zero();
    for (int d = 0; d <= n; ++d) {
      sum = RING.add(sum, RING.monomial(lambda(d, k, c), d));
    }
    return sum;
  }

  private Z zeta(final int c, final int d, final int k) {
    final int n = d - 2 * k;
    return RING.multiply(RING.pow(psiBarSeries(n).substitutePower(2, n), k, n), lambdaStarSeries(k, c, n), n).coeff(n);
  }

  private Z eta(final int c, final int d) {
    Z sum = Z.ZERO;
    for (int k = 1; k <= d / 2; ++k) {
      sum = sum.signedAdd((k & 1) == 1, zeta(c, d, k));
    }
    return sum;
  }

  private Z gammaTilde(final int d, final int c) {
    if (c == 1) {
      return (d & 1) == 0 ? psiBarSeries(d / 2).coeff(d / 2) : Z.ZERO;
    }
    if (c == 2) {
      final Z eta = eta(2, d).add((d & 1) == 1 ? psiBarSeries(d / 2).coeff((d - 1) / 2).multiply(d) : Z.ZERO);
      System.out.println("gamma~ c==2 d==" + d + " psibar=" + psiBarSeries(d / 2).coeff((d - 1) / 2) + " -> eta=" + eta);
      return eta;
    } else {
      assert c > 2;
      return eta(c, d);
    }
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final int n2 = 2 * mN;
    for (final Z dd : Cheetah.factor(n2).divisors()) {
      final int d = dd.intValue();
      final int c = n2 / d;
      sum = sum.add(gammaTilde(d, c).multiply(LongUtils.phi(c)));
      System.out.println(mN + " " + d + " " + c + " -> " + sum);
    }
    //return sum.divide(mN);
    return sum.divide(n2);
  }
}

