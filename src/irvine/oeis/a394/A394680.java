package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.series.Hypergeometric;
import irvine.math.series.SeriesParser;
import irvine.oeis.gf.GfSequence;

/**
 * A394680 allocated for Alex Shvets.
 * @author Sean A. Irvine
 */
public class A394680 extends GfSequence {

  /** Construct the sequence. */
  public A394680() {
    super(0, SQ.square(Hypergeometric.s(new Q[] {Q.ONE_THIRD, new Q(2, 3)}, new Q[] {new Q(3, 2)}, SeriesParser.parse("27*x/(1-4*x)^3"))));
  }
}
