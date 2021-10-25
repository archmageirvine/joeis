package irvine.oeis.a052;

import java.util.Arrays;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052121 Triangle of coefficients of polynomials enumerating trees with n labeled nodes by inversions.
 * @author Sean A. Irvine
 */
public class A052121 implements Sequence {

  private static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> X_RING = new PolynomialRingField<>(Y_RING);
  private static final Polynomial<Q> Y1 = Y_RING.create(Arrays.asList(Q.NEG_ONE, Q.ONE));

  private final MemoryFactorial mF = new MemoryFactorial();
  private Polynomial<Polynomial<Q>> mSum = X_RING.one();
  private Polynomial<Polynomial<Q>> mEgf = X_RING.zero();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    final int lim = (mN - 1) * (mN - 2) / 2 + 1;
    if (++mM >= lim) {
      ++mN;
      mM = 0;
      final Polynomial<Q> y = Y_RING.series(Y_RING.one(), Y_RING.pow(Y1, mN), lim).shift(mN * (mN - 1) / 2);
      mSum = X_RING.add(mSum, X_RING.monomial(Y_RING.divide(y, new Q(mF.factorial(mN))), mN));
      System.out.println("sum=" + mSum);
      final Polynomial<Polynomial<Q>> log = X_RING.log(mSum, mN);
      mEgf = X_RING.multiply(log, Y1);
      System.out.println(mEgf);
    }
    return mEgf.coeff(mN).coeff(mM).multiply(mF.factorial(mN)).toZ();
  }
}
/*
rows = 8; egf = (y - 1)*Log[Sum[(y^Binomial[n, 2]*(x^n/n!))/(y - 1)^n, {n, 0, rows + 1}]]; t = CoefficientList[ Series[egf, {x, 0, rows}, {y, 0, 3*rows}], {x, y}] ; Table[(n - 1)!*t[[n, k]], {n, 2, rows + 1}, {k, 1, Binomial[n - 2, 2] + 1}] // Flatten
 */
