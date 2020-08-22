package irvine.oeis.a028;

import java.util.Arrays;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028953 Theta series of quadratic form (or lattice) with Gram matrix [ 3, 1; 1, 4 ].
 * @author Sean A. Irvine
 */
public class A028953 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> X2 = RING.monomial(Z.ONE, 2);
  private static final Polynomial<Z> X22 = RING.monomial(Z.ONE, 22);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z[] t = new Z[mN + 1];
    final Z[] u = new Z[mN + 1];
    Arrays.fill(t, Z.ZERO);
    Arrays.fill(u, Z.ZERO);
    u[0] = Z.ONE;
    t[0] = Z.ONE;
    for (int k = 1; k * k <= mN; ++k) {
      t[k * k] = Z.TWO;
    }
    for (int k = 1; 11 * k * k <= mN; ++k) {
      u[11 * k * k] = Z.TWO;
    }
    final Polynomial<Z> a = RING.multiply(Polynomial.create(t), Polynomial.create(u), mN);
    final Polynomial<Z> b = RING.multiply(RING.eta(X2, mN), RING.eta(X22, mN), mN).shift(1);
    return a.coeff(mN).subtract(b.coeff(mN).multiply2());
  }
}
