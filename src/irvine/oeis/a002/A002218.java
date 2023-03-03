package irvine.oeis.a002;

import irvine.math.polynomial.CombinatorialSpecies;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002218 Number of unlabeled nonseparable (or 2-connected) graphs (or blocks) with n nodes.
 * @author Sean A. Irvine
 */
public class A002218 extends Sequence1 {

  // After Andrew Howroyd

  private static final CycleIndex S1NEG1 = new CycleIndex("", MultivariateMonomial.create(1, -1));
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Polynomial<CycleIndex> g = CombinatorialSpecies.graphSeries(mN);
    final Polynomial<CycleIndex> gc = CombinatorialSpecies.sLog(g);
    final Polynomial<CycleIndex> gcr = CombinatorialSpecies.sPoint(gc, 1);
    final Polynomial<CycleIndex> gcrxs1 = CombinatorialSpecies.RING.multiply(gcr.shift(-1), S1NEG1);
    final Polynomial<CycleIndex> log = CombinatorialSpecies.sLog(gcrxs1);
    final Polynomial<CycleIndex> solve = CombinatorialSpecies.sSolve(log, gcr).shift(1);
    final Polynomial<CycleIndex> integral = CombinatorialSpecies.integrate(solve, 1);
    final Polynomial<CycleIndex> subs = CombinatorialSpecies.drop(gc, 1);
    final Polynomial<CycleIndex> solve1 = CombinatorialSpecies.sSolve(subs, gcr);
    final Polynomial<CycleIndex> add = CombinatorialSpecies.RING.add(integral, solve1);
    return CombinatorialSpecies.eval1(add).coeff(mN).toZ();
  }
}
