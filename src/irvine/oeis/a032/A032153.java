package irvine.oeis.a032;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A032153 Number of ways to partition n elements into pie slices of different sizes.
 * @author Sean A. Irvine
 */
public class A032153 extends MemorySequence {

  protected static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);
  private static final Polynomial<Polynomial<Q>> C = RING.monomial(Y_RING.create(Arrays.asList(Q.NEG_ONE, Q.ONE)), 0);

  {
    add(null); // seq starts at 1
  }

  protected Polynomial<Polynomial<Q>> product() {
    Polynomial<Polynomial<Q>> prod = RING.one();
    for (int k = 1; k < size(); ++k) {
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(Y_RING.x(), k);
      prod = RING.multiply(prod, u, size());
    }
    return prod;
  }

  @Override
  protected Z computeNext() {
    if (size() < 1) {
      return Z.ONE;
    }
    final Polynomial<Polynomial<Q>> v = RING.add(C, product());
    return Y_RING.eval(Y_RING.serlaplace(v.coeff(size() - 1).shift(-1)), Q.ONE).toZ();
  }
}
