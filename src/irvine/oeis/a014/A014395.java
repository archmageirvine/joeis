package irvine.oeis.a014;

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
 * A014395 Number of multigraphs with 5 nodes and n edges.
 * @author Sean A. Irvine
 */
public class A014395 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final CycleIndex mCycleIndex = multigraphCycleIndex(nodes());
  private int mN = -1;

  private static CycleIndex multigraphCycleIndex(final int n) {
    final CycleIndex zn = SymmetricGroup.create(n).cycleIndex();
    return zn.op(PairMultiply.OP, zn);
  }

  private static Polynomial<Q> multigraphGf(final CycleIndex ci, final int m) {
    final Polynomial<Q> s = RING.series(RING.one(), RING.oneMinusXToTheN(1), m);
    return ci.apply(s, m);
  }

  protected int nodes() {
    return 5;
  }

  @Override
  public Z next() {
    return multigraphGf(mCycleIndex, ++mN).coeff(mN).toZ();
  }
}

