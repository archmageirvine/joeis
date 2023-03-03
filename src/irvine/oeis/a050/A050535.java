package irvine.oeis.a050;

import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.PairMultiply;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A050535 Number of loopless multigraphs on infinite set of nodes with n edges.
 * @author Sean A. Irvine
 */
public class A050535 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> DEN = RING.oneMinusXToTheN(1);

  private Polynomial<Q> gy(final int n) {
    if (n == 0) {
      return RING.one();
    }
    final Polynomial<Q> poly = RING.series(RING.one(), DEN, n);
    final CycleIndex zn = SymmetricGroup.create(n).cycleIndex();
    final CycleIndex z = zn.op(PairMultiply.OP, zn);
    return z.apply(poly, n);
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    // Graph with n edges can have at most 2n connected nodes
    return gy(2 * mN).coeff(mN).toZ();
  }
}


