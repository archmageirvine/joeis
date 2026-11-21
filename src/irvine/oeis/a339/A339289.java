package irvine.oeis.a339;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.oeis.Sequence;
import irvine.oeis.gf.GfSequence;

/**
 * A339289 Number of essentially parallel oriented series-parallel networks with n elements and without multiple unit elements in parallel.
 * @author Gregory Morse
 */
public class A339289 extends GfSequence {
  static Series<Q> part(final Sequence all, final boolean series) {
    final Series<Q> b = SQ.shift(Series.create(all), 1);
    return SQ.divide(series ? SQ.multiply(b, b) : b, SQ.add(SQ.one(), b));
  }

  protected A339289(final Sequence all, final boolean series) {
    super(1, part(all, series));
  }

  /** Construct the sequence. */
  public A339289() {
    this(new A339290(), false);
  }
}
