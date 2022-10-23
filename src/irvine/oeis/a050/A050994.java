package irvine.oeis.a050;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A050994 Reduced numerators of series expansion for integrand in Renyi's parking constant.
 * @author Sean A. Irvine
 */
public class A050994 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  private Polynomial<Q> pseudoEi(final int n) {
    // Ei(z) = gamma + ln z + sum_{k>=1} (1/k*k!)z^k
    // Here we ignore gamma and ln z contribution and our z = -x
    final ArrayList<Q> t = new ArrayList<>();
    t.add(Q.ZERO); // z^0
    Z f = Z.ONE;
    for (int k = 1; k <= n; ++k) {
      f = f.multiply(-k);
      t.add(new Q(Z.ONE, f.multiply(k)));
    }
    return RING.create(t);
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(RING.exp(RING.multiply(pseudoEi(++mN), Q.TWO), mN).coeff(mN));
  }
}
