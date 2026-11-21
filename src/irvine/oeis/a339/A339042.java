package irvine.oeis.a339;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.oeis.gf.GfSequence;

/**
 * A339042 Number of unlabeled connected loopless multigraphs with n edges rooted at two noninterchangeable vertices.
 * @author Gregory Morse
 */
public class A339042 extends GfSequence {
  static Series<Q> gf(final boolean quotient) {
    final A339065 graphs = new A339065();
    final Series<Q> unrooted = Series.create(graphs.unrooted());
    final Series<Q> rooted = SQ.divide(Series.create(graphs.singlyRooted()), unrooted);
    final Series<Q> both = SQ.divide(Series.create(graphs), unrooted);
    final Series<Q> separate = SQ.multiply(rooted, rooted);
    return quotient ? SQ.divide(both, separate) : SQ.subtract(both, separate);
  }

  /** Construct the sequence. */
  public A339042() {
    super(1, gf(false));
  }
}
