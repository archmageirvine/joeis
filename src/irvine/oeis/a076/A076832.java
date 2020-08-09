package irvine.oeis.a076;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.PolynomialRingField;
import irvine.math.group.ProjectiveGeneralLinearCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A076832.
 * @author Sean A. Irvine
 */
public class A076832 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final List<CycleIndex> mCycleIndices = new ArrayList<>();
  {
    mCycleIndices.add(null);
  }
  private int mN = 0;
  private int mM = 0;

  private CycleIndex getCycleIndex(final int n) {
    while (n >= mCycleIndices.size()) {
      mCycleIndices.add(ProjectiveGeneralLinearCycleIndex.cycleIndex(mCycleIndices.size()));
    }
    return mCycleIndices.get(n);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final CycleIndex ci = getCycleIndex(mM);
    final ArrayList<Polynomial<Q>> polys = new ArrayList<>();
    for (int k = 1; k <= ci.maxIndex(); ++k) {
      polys.add(RING.series(RING.one(), RING.oneMinusXToTheN(k), mN));
    }
    final Polynomial<Q> gf = ci.apply(polys, Z.valueOf(mN));
    return gf.coeff(mN).toZ();
  }
}

