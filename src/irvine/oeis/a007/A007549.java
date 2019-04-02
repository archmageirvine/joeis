package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007549 Number of increasing rooted connected graphs where every block is a complete graph.
 * @author Sean A. Irvine
 */
public class A007549 extends MemorySequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final ArrayList<Q> mCoeffs = new ArrayList<>();
  private Z mF = Z.ONE;
  {
    mCoeffs.add(Q.ZERO);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size() - 1;
    if (n < 1) {
      mCoeffs.add(Q.ONE);
      return Z.ONE;
    } else {
      mF = mF.multiply(n);
      final Polynomial<Q> egf = RING.create(mCoeffs);
      final Polynomial<Q> et = RING.exp(RING.subtract(RING.exp(egf, n), RING.one()), n);
      final Q e = et.coeff(n);
      mCoeffs.add(e.divide(n + 1));
      return e.multiply(mF).toZ();
    }
  }
}
