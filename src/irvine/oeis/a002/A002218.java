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

  /**
   * Cycle index series for nonseparable graphs.
   * @param n maximum order
   * @return cycle index series
   */
  public static Polynomial<CycleIndex> blockSeries(final int n) {
    final Polynomial<CycleIndex> g = CombinatorialSpecies.graphSeries(n);
    final Polynomial<CycleIndex> gc = CombinatorialSpecies.sLog(g);
    final Polynomial<CycleIndex> gcr = CombinatorialSpecies.sPoint(gc, 1);
    final Polynomial<CycleIndex> gcrxs1 = CombinatorialSpecies.RING.multiply(gcr.shift(-1), S1NEG1);
    final Polynomial<CycleIndex> log = CombinatorialSpecies.sLog(gcrxs1);
    final Polynomial<CycleIndex> solve = CombinatorialSpecies.sSolve(log, gcr).shift(1);
    final Polynomial<CycleIndex> integral = CombinatorialSpecies.integrate(solve, 1);
    final Polynomial<CycleIndex> subs = CombinatorialSpecies.drop(gc, 1);
    final Polynomial<CycleIndex> solve1 = CombinatorialSpecies.sSolve(subs, gcr);
    return CombinatorialSpecies.RING.add(integral, solve1);
  }

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : blockSeries(mN).coeff(mN).eval(1).toZ();
  }
}
