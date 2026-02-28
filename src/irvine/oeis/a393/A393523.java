package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393523 Triangle T(n,k) read by rows: number of unordered increasing trees on n nodes, with k nodes colored blue and n-k nodes colored red, such that each red node has at least two children.
 * @author Sean A. Irvine
 */
public class A393523 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private Polynomial<Polynomial<Q>> mGf = new PolynomialRingField<>(new PolynomialRingField<>(Rationals.SINGLETON)).zero();

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, mN + 1);
      final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(inner);
      final Polynomial<Polynomial<Q>> t = ring.subtract(ring.subtract(ring.multiply(ring.exp(mGf, mN), Polynomial.create(Q.ONE, Q.ONE)), mGf), ring.one());
      mGf = ring.integrate(t);
      //System.out.println("gf=" + mGf);
    }
    return mGf.coeff(mN).coeff(mM).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
