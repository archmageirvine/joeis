package irvine.oeis.a339;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.oeis.gf.GfSequence;

/**
 * A339041 Number of unlabeled connected simple graphs with n edges rooted at two indistinguishable vertices.
 * @author Gregory Morse
 */
public class A339041 extends GfSequence {
  private static Series<Q> gf(final A339063 paired) {
    final Series<Q> graphs = Series.create(paired.unrooted());
    final Series<Q> r = SQ.divide(Series.create(paired.singlyRooted()), graphs);
    final Series<Q> separate = SQ.divide(SQ.add(SQ.multiply(r, r), SQ.substitute(r, 2)), Q.TWO);
    return SQ.subtract(SQ.divide(Series.create(paired), graphs), separate);
  }

  protected A339041(final A339063 paired) {
    super(1, gf(paired));
  }

  /** Construct the sequence. */
  public A339041() {
    this(new A339064());
  }
}
