package irvine.oeis.a035;

import java.util.Collections;
import java.util.List;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.transform.BhjTransformSequence;

/**
 * A035357 Number of increasing asymmetric rooted polygonal cacti with bridges (mixed Husimi trees).
 * @author Sean A. Irvine
 */
public class A035357 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mA = RING.empty();
  {
    mA.add(Z.ZERO);
  }
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 3) {
      mA.add(Z.ONE);
    } else {
      final List<Z> bhj = BhjTransformSequence.bhj(mA.shift(-1));
      final Polynomial<Q> q = new Polynomial<>(Q.ZERO, Q.ONE, Collections.emptyList());
      q.add(Q.ZERO);
      for (final Z v : bhj) {
        q.add(new Q(v));
      }
      final Polynomial<Q> egj = A035081.egj(q);
      mA.add(egj.coeff(mN - 1).toZ());
    }
    return mA.coeff(mN);
  }
}

