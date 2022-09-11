package irvine.oeis.a059;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059057 Penrice Christmas gift numbers, Card-matching numbers (Dinner-Diner matching numbers).
 * @author Sean A. Irvine
 */
public class A059057 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C1 = Polynomial.create(-1, 1);
  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;

  protected int mN = -1;
  protected int mM = 0;

  // p := (x, k)->k!^2*sum(x^j/((k-j)!^2*j!), j=0..k);
  private Polynomial<Z> p(final int k) {
    final Z kf2 = F.factorial(k).square();
    final Polynomial<Z> res = RING.empty();
    for (int j = 0; j <= k; ++j) {
      res.add(kf2.divide(F.factorial(k - j).square().multiply(F.factorial(j))));
    }
    return res;
  }

  // R := (x, n, k)->p(x, k)^n;
  private Polynomial<Z> rook(final int n, final int k) {
    return RING.pow(p(k), n);
  }

  // f := (t, n, k)->sum(coeff(R(x, n, k), x, j)*(t-1)^j*(n*k-j)!, j=0..n*k);
  protected Polynomial<Z> f(final int n, final int k) {
    Polynomial<Z> sum = RING.zero();
    final Polynomial<Z> r = rook(n, k);
    for (int j = 0; j <= n * k; ++j) {
      final Z c = r.coeff(j).multiply(F.factorial(n * k - j));
      sum = RING.add(sum, RING.multiply(RING.pow(C1, j), c));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
    }
    return f(mN, 2).coeff(mM);
  }
}
