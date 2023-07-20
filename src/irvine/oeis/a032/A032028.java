package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;

/**
 * A032028 Number of rooted planar trees (n+1 nodes) where any 2 subtrees extending from same node are different.
 * @author Sean A. Irvine
 */
public class A032028 extends Sequence1 {

  protected static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);
  private final MemorySequence mA = new A032027();
  private int mN = 0;

  protected Polynomial<Polynomial<Q>> product() {
    Polynomial<Polynomial<Q>> prod = RING.one();
    for (int k = 1; k < mN; ++k) {
      final Polynomial<Polynomial<Q>> u = RING.powz(RING.onePlusXToTheN(Y_RING.x(), k), mA.a(k), mN);
      prod = RING.multiply(prod, u, mN);
    }
    return RING.subtract(prod, RING.one());
  }

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ONE;
    }
    final Polynomial<Polynomial<Q>> v = product();
    return Y_RING.eval(Y_RING.serlaplace(v.coeff(mN - 1).shift(-1)), Q.ONE).toZ();
  }
}
