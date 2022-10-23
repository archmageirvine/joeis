package irvine.oeis.a005;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005016 Certain subgraphs of a directed graph.
 * @author Sean A. Irvine
 */
public class A005016 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    // This is not very efficient, recomputes the g.f. each time
    Polynomial<Q> gf = RING.zero();
    for (int k = 0; k <= mN; ++k) {
      Polynomial<Q> t = RING.one();
      Z p = Z.ONE;
      for (int j = 1; j <= k; ++j) {
        p = p.multiply2();
        final Polynomial<Q> tj = RING.series(RING.one(), RING.create(Arrays.asList(Q.ONE, new Q(p.subtract(2)))), mN - k);
        t = RING.multiply(t, RING.multiply(tj, new Q(p.subtract(1))), mN - k);
      }
      gf = RING.add(gf, t.shift(k));
    }
    return gf.coeff(mN).toZ();
  }

}

