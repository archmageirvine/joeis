package irvine.oeis.a057;

import java.util.List;

import irvine.math.graph.Edges;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a054.A054733;
import irvine.oeis.a054.A054951;

/**
 * A057276.
 * @author Sean A. Irvine
 */
public class A057276 extends A054951 {

  private int mN = 0;
  private int mM = 0;
  private Polynomial<Q> mRow = null;

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1)) {
      ++mN;
      mM = 0;
      final DegreeLimitedPolynomialRingField<Q> fld = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, mN * (mN - 1));
      final List<List<Polynomial<Q>>> gcid = graphCycleIndexData(mN, Edges.DIGRAPH_EDGES, fld, e -> fld.onePlusXToTheN(e));
      final List<List<Polynomial<Q>>> inv = invGgfCiData(gcid, fld, e -> fld.onePlusXToTheN(e));
      final Polynomial<Polynomial<Q>> res = A054733.inverseEuler(unlabeledOgf(fld, inv), mN, mN * (mN - 1));
      mRow = res.coeff(mN);
    }
    return mRow.coeff(mM).toZ().negate();
  }
}
