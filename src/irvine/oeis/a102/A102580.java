package irvine.oeis.a102;

import irvine.math.q.Q;
import irvine.math.series.RationalSeriesEnum;
import irvine.math.series.Series;
import irvine.oeis.Sequence;
import irvine.oeis.gf.EgfSequence;

/**
 * A102580 Number of n-node labeled connected digraphs whose underlying graphs are mating graphs, cf. A006024.
 * @author Gregory Morse
 */
public class A102580 extends EgfSequence {
  // After Andrew Howroyd.
  private static Series<Q> gf(final Sequence all) {
    final Series<Q> u = SQ.add(SQ.one(), SQ.x());
    final Series<Q> graphs = SQ.hadamardMultiply(Series.create(all), RationalSeriesEnum.EXP.s(SQ.x()));
    return SQ.add(u, RationalSeriesEnum.LOG1P.s(SQ.subtract(SQ.divide(graphs, u), SQ.one())));
  }

  protected A102580(final Sequence all) {
    super(0, gf(all));
  }

  /** Construct the sequence. */
  public A102580() {
    this(new A102579());
  }
}
