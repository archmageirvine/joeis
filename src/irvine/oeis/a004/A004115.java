package irvine.oeis.a004;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CombinatorialSpecies;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004115 Number of unlabeled rooted nonseparable graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A004115 implements Sequence {

  // After Andrew Howroyd

  private int mN = 0;

  private static final CycleIndex S1NEG1 = new CycleIndex("", MultivariateMonomial.create(1, -1));
  private static final PolynomialRingField<Q> POLY = new PolynomialRingField<>(Rationals.SINGLETON);

  private Polynomial<Q> apply(final Polynomial<CycleIndex> p) {
    final Polynomial<Q> res = POLY.empty();
    for (final CycleIndex c : p) {
      res.add(c.eval(1));
    }
    return res;
  }

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
    return apply(solve).coeff(mN - 1).toZ();
  }
}
