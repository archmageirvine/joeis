package irvine.oeis.a339;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.oeis.gf.GfSequence;

/**
 * A339037 Number of unlabeled connected loopless multigraphs with n edges rooted at one oriented edge.
 * @author Gregory Morse
 */
public class A339037 extends GfSequence {
  static Series<Q> quotient(final A339063 paired) {
    return SQ.divide(Series.create(paired), Series.create(paired.unrooted()));
  }

  protected A339037(final A339063 paired) {
    super(1, SQ.shift(quotient(paired), 1));
  }

  /** Construct the sequence. */
  public A339037() {
    this(new A339065());
  }
}
