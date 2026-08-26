package irvine.oeis.a086;

import irvine.math.q.Q;
import irvine.math.series.RationalSeriesEnum;
import irvine.math.series.Series;
import irvine.oeis.gf.EgfSequence;

/**
 * A086365 n-th Bell number of type D: Number of symmetric partitions of {-n,...,n}\{0} such that none of the subsets is of the form {j,-j}.
 * @author Sean A. Irvine
 */
public class A086365 extends EgfSequence {

  private static final Series<Q> E1 = SQ.subtract(RationalSeriesEnum.EXP.s(), SQ.one());
  private static final Series<Q> E2 = SQ.multiply(SQ.subtract(RationalSeriesEnum.EXP.s(SQ.create(Q.ZERO, Q.TWO)), SQ.one()), Q.HALF);

  /** Construct the sequence. */
  public A086365() {
    super(0, RationalSeriesEnum.EXP.s(SQ.subtract(SQ.add(E1, E2), SQ.x())));
    skip();
  }
}

