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
import irvine.oeis.Sequence1;

/**
 * A076832 Triangle T(n,k), read by rows, giving the total number of inequivalent binary linear [n,i] codes with no column of zeros, summed for i &lt;= k (n &gt;= 1, 1 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A076832 extends Sequence1 {

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

  protected Z t(final int n, final int m) {
    if (m < 1) {
      return Z.ZERO;
    }
    final CycleIndex ci = getCycleIndex(m);
    final ArrayList<Polynomial<Q>> polys = new ArrayList<>();
    for (int k = 1; k <= ci.maxIndex(); ++k) {
      polys.add(RING.series(RING.one(), RING.oneMinusXToTheN(k), n));
    }
    final Polynomial<Q> gf = ci.apply(polys, Z.valueOf(n));
    return gf.coeff(n).toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}

