package irvine.oeis.a100;

import irvine.math.q.Q;
import irvine.math.series.RationalSeriesEnum;
import irvine.math.series.Series;
import irvine.oeis.Sequence;
import irvine.oeis.a053.A053763;
import irvine.oeis.gf.EgfSequence;

/**
 * A100548 Number of n-node labeled digraphs without endpoints.
 * @author Gregory Morse
 */
public class A100548 extends EgfSequence {
  // After Andrew Howroyd.
  private static Series<Q> gf(final Sequence all, final int choices) {
    final Series<Q> e = RationalSeriesEnum.EXP.s(SQ.x());
    final Series<Q> graphs = SQ.hadamardMultiply(Series.create(all), e);
    final Series<Q> sub = SQ.shift(RationalSeriesEnum.EXP.s(SQ.monomial(new Q(-choices), 1)), 1);
    return SQ.multiply(RationalSeriesEnum.EXP.s(SQ.monomial(new Q(choices, 2), 2)), SQ.substitute(graphs, sub));
  }

  protected A100548(final Sequence all, final int choices) {
    super(0, gf(all, choices));
  }

  /** Construct the sequence. */
  public A100548() {
    this(new A053763(), 3);
  }
}
