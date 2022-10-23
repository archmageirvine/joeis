package irvine.oeis.a004;

import irvine.math.polynomial.CombinatorialSpecies;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004115 Number of unlabeled rooted nonseparable graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A004115 extends Sequence1 {

  // After Andrew Howroyd

  private static final CycleIndex S1NEG1 = new CycleIndex("", MultivariateMonomial.create(1, -1));
  private int mN = 0;

  @Override
  public Z next() {
    final Polynomial<CycleIndex> g = CombinatorialSpecies.graphSeries(++mN);
    //StringUtils.message("( " + sPoint(g, 1) + " ) / ( " + g + " )");
    final Polynomial<CycleIndex> gcr = CombinatorialSpecies.divide(CombinatorialSpecies.sPoint(g, 1), g);
    //StringUtils.message("gcr=" + gcr);
    final Polynomial<CycleIndex> gcrxs1 = CombinatorialSpecies.RING.multiply(gcr.shift(-1), S1NEG1);
    //StringUtils.message("gcrxs1=" + gcrxs1);
    final Polynomial<CycleIndex> log = CombinatorialSpecies.sLog(gcrxs1);
    //StringUtils.message("log=" + log);
    final Polynomial<CycleIndex> solve = CombinatorialSpecies.sSolve(log, gcr);
    //StringUtils.message("solve=" + solve); // technically should *x
    return CombinatorialSpecies.eval1(solve).coeff(mN - 1).toZ();
  }
}
